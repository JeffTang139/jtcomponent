/**
 * CopyRight: jt 2009
 */
package org.eclipse.jt.sql.assist.core.process;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jt.script.assist.IPositionManager;
import org.eclipse.jt.script.assist.ISourcePosition;
import org.eclipse.jt.script.assist.IWarningPosition;




/**
 * @author Jeff Tang
 *
 */
public class PositionManager implements IPositionManager {
	private static class CodeModel {
		private List<Integer> linePos=new ArrayList<Integer>();
		private  char lineSep=System.getProperty("line.separator").charAt(0);
		private int endPosition=0;

		public CodeModel() {
		}
		
		public void append(String content, boolean newLine) {
			if(content==null) return;
			if(newLine) this.linePos.add(endPosition);
			int start=endPosition;
			int index=-1;
			while((index=content.indexOf(lineSep,index+1))>=0) {
				linePos.add(start+index);
			}
			endPosition=start+content.length();
		}
		
		public int getOffsetOfLine(int lineNumber) {
			return linePos.get(lineNumber);
		}
		
		public int getEnd() {
			return this.endPosition;
		}
		
		public int getLineCount() {
			return this.linePos.size();
		}
		
		public int getLineOf(int offset) {
			int line=-1;
			if(linePos!=null) {
				int left=0; int right=linePos.size();
				while(left<right) {
					line=(left+right)/2;
					if(linePos.get(line)<offset) {
						left=line+1;
					} else if(linePos.get(line)>offset) {
						right=line;
					} else {
						left=line;
						break;
					}
				}
				line=left-1;
			}
			return line;
		}
	}
	
	private String fId;
	private CodeModel fModel;
	private List<String> fSources;
	
	public PositionManager(String id,String content) {
		fId=id;
		this.fModel=new CodeModel();
		fSources=new ArrayList<String>();
		append(content, true);
	}
	
	public void append(String content, boolean newLine) {
		fModel.append(content, newLine);
		fSources.add(content);
	}
	
	public int getLine(int offset) {
		return fModel.getLineOf(offset);
	}
	
	public int getColumn(int offset) {
		return getColumn(getLine(offset),offset);	
	}
	
	public int getColumn(int line, int offset) {
		if(line<0) return offset;
		if(line>=fModel.getLineCount()) return offset-this.fModel.getEnd();
		return offset-this.fModel.getOffsetOfLine(line);
	}
	
	public int getOffset(int line, int column) {
		if(line<0) return column;
		if(line>=fModel.getLineCount()) return column+this.fModel.getEnd();
		return column+this.fModel.getOffsetOfLine(line);
	}
	
	public ISourcePosition getSourcePosition(int offset) {
		return getSourcePosition(offset,0);
	}
	
	public ISourcePosition getSourcePosition(int offset, int length) {
		return new SourcePosition(offset,offset+length);
	}
	
	public IWarningPosition getWarningPosition(int offset, int length) {
		return new WarningPosition(offset,offset+length,this);
	}
	
	public IWarningPosition getWarningPosition(ISourcePosition sourcePos) {
		return new WarningPosition(sourcePos.getStart(),sourcePos.getEnd(),this);
	}
	
	public static boolean isEmpty(ISourcePosition pos) {
		return pos==null || pos.getEnd()<0 || pos.getStart()<0;
	}
	
	public ISourcePosition fix(ISourcePosition sourcePos) {
		if(sourcePos==null) return new SourcePosition(0,0);
		ISourcePosition fixed=sourcePos;
		if(isEmpty(sourcePos)||fixed.getStart()>=fModel.getEnd()||fixed.getEnd()>=fModel.getEnd()) {
			int start=sourcePos.getStart()<0 ? 0 : sourcePos.getStart();
			if(start>=fModel.getEnd())  start=fModel.getEnd()-1;
			int end=sourcePos.getEnd()>fModel.getEnd() ? fModel.getEnd()-1 : sourcePos.getEnd();
			if(end<start) end=start;
			fixed = new SourcePosition(start,end);
		}
		return fixed;
	}
	
	public ISourcePosition getEmpty() {
		return SourcePosition.getEmpty();
	}

	public String getId() {
		return fId;
	}

	public String getSource(ISourcePosition position) {
		if(position==null) return null;
		int begin=position.getStart();
		int end=position.getEnd();
		if(begin<0) begin=0;
		if(end<0) end=Integer.MAX_VALUE;
		int last=0;
		int tail;
		StringBuffer buffer=null;
		for(String str : this.fSources) {
			tail=last+str.length();
			if(end<tail) {
				if(buffer==null) {
					return str.substring(begin-last,end-last);
				} else {
					buffer.append(str.substring(0, end-last));
					break;
				}
			} else if(begin<tail) {
				if(buffer==null) buffer=new StringBuffer();
				buffer.append(str.substring(begin-last));
			}
			last=tail;
		}
		return buffer!=null?buffer.toString():null;
	}
}
