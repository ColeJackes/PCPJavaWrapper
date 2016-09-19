package com.pannaramic.metrics.pcp;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
//import com.sun.jna.Structure.StructField;

public class PmID extends Structure {

	public int pmid;
	public PmValue[] pmvalue = new PmValue[1];
	//public PmValueSet.ByReference vset = new PmValueSet.ByReference();
	
	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"pmid", "pmvalue"});
	}
	
	@Override
	protected void useMemory(Pointer m) {
		// TODO Auto-generated method stub
		super.useMemory(m);
	}
	
	@Override
	protected void useMemory(Pointer m, int offset) {
		// TODO Auto-generated method stub
		super.useMemory(m, offset);
	}
	
	@Override
	protected void writeField(StructField structField) {
		// TODO Auto-generated method stub
		super.writeField(structField);
	}
	
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
	}
	@Override
	public void writeField(String name) {
		// TODO Auto-generated method stub
		super.writeField(name);
	}
	
	@Override
	public void writeField(String name, Object value) {
		// TODO Auto-generated method stub
		super.writeField(name, value);
	}
	
	@Override
	protected Object readField(StructField structField) {
		// TODO Auto-generated method stub
		return super.readField(structField);
	}
	
	@Override
	public void read() {
		// TODO Auto-generated method stub
		super.read();
	}
	
	@Override
	public Object readField(String name) {
		// TODO Auto-generated method stub
		return super.readField(name);
	}
}
