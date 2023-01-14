package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collage {

	private int collageId;
	private String collageName;
    private String address;
	public Collage(int collageId, String collageName, String address) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.address = address;
	}
	
	
	public Collage() {
		super();
	}


	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", address=" + address + "]";
	}
   
    
    
	
	
	
	
	
}
