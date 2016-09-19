package com.pannaramic.metrics.pcp;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class PmValueSet extends Structure implements Structure.ByReference{
	private static PmValueSet INSTANCE;
	
	public int pmid;
	public int numval;
	public int valfmt;
	public PmValue[] vlist = new PmValue[1];
	
	public static PmValueSet getInstance() {
		return INSTANCE;
	}
	
	public PmValueSet(Pointer pointer) {
		super(pointer);
		INSTANCE = this;
		read();
	}
	
	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"pmid", "numval", "valfmt", "vlist"});
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
	
	//gets called
	@Override
	protected Object readField(StructField structField) {
		// TODO Auto-generated method stub
		if (numval > 1)
		{
			vlist = new PmValue[numval];
		}
		return super.readField(structField);
	}
	
	//gets called
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
