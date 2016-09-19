 package com.pannaramic.metrics.pcp;

import java.util.Arrays;
import com.google.common.primitives.Ints;

import java.util.List;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

public class PmValueBlock extends Structure {
	
    public static class ByReference extends PmValueBlock
    implements Structure.ByReference {
    }
	
    public int rawVtypeAndVlen;
	
	public byte[] vbuf = new byte[1];
    
	public PmValueBlock() {

	}
	
	public PmValueBlock(Pointer pointer) {
		super(pointer);
		read();
	}
	
	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"rawVtypeAndVlen", "vbuf"});
	}
	
	public int getVtype () {
		byte[] byteArray = Ints.toByteArray(rawVtypeAndVlen);
		return Ints.fromBytes((byte)0x0, (byte)0x0, (byte)0x0, byteArray[0]);
	}
	
	public int getVlen () {
		byte[] byteArray = Ints.toByteArray(rawVtypeAndVlen);
		//System.out.println("Bytes " + byteArray[0] + " " + byteArray[1] + " " + byteArray[2] + " " + byteArray[3]);
		return Ints.fromBytes((byte)0x0, byteArray[1], byteArray[2], byteArray[3]);
	}
	
	@Override
	protected Object readField(StructField structField) {
		// TODO Auto-generated method stub
		byte[] byteArray = Ints.toByteArray(rawVtypeAndVlen);
		int len = Ints.fromBytes((byte)0x0, byteArray[1], byteArray[2], byteArray[3]);
	
		if (len > 4)
		{
			vbuf = new byte[len - 4];
		}
		
		return super.readField(structField);
	}
	
}
