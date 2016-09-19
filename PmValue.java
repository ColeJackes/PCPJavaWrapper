package com.pannaramic.metrics.pcp;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.Union;

public class PmValue extends Structure {
	
    public static class ByReference extends PmValue
    	implements Structure.ByReference {
    }
	
	//union in the C struct
	public int inst;
	
	public static class UNION extends Union {
        public static class ByReference extends UNION
            implements Structure.ByReference {
        }
        
        public PmValueBlock.ByReference pval;
        public int lval;
        
    }
	
	public UNION value;
	
	public void read() {
        super.read();
        
        if (PmValueSet.getInstance().numval == 0)
        {
        	
        }
        else if (PmValueSet.getInstance().valfmt == 0)
        {
        	value.setType(int.class);
        }
        else 
        {
        	value.setType(PmValueBlock.ByReference.class);
        }
        
        value.read();
    }
	
	
	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"inst", "value"});
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
	public Object readField(String name) {
		// TODO Auto-generated method stub
		return super.readField(name);
	}
	
}
