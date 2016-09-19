package com.pannaramic.metrics.pcp;

import java.util.Arrays;
import java.util.List;

import com.sun.jna.Structure;

public class PmDesc extends Structure {

    public static class ByReference extends PmDesc
    implements Structure.ByReference {
    }
	
	public int pmid;
	public int type;
	public int indom;
	public int sem;
	public PmUnits pmunits;
	
	
	@Override
	protected List<String> getFieldOrder() {
		// TODO Auto-generated method stub
		return Arrays.asList(new String[] {"pmid", "type", "indom", "sem", "pmunits"});
	}

}
