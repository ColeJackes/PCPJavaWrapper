package com.pannaramic.metrics.pcp;


import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class PmTimeval extends Structure {
	public long time_t;
	public long tv_usec;
	
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
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"time_t", "tv_usec"});
	}
}
