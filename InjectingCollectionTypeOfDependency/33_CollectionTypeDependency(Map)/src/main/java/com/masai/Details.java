package com.masai;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Details {

	private String countryName;
	private Map<String, String> StateCapital;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Map<String, String> getStateCapital() {
		return StateCapital;
	}
	public void setStateCapital(Map<String, String> stateCapital) {
		StateCapital = stateCapital;
	}
	
 	public void detailShow() {
 		System.out.println("Country Name : "+countryName);
 		Set<Entry<String, String>> entries= StateCapital.entrySet();
 		
 		for(Entry<String, String> entry:entries) {
 			
 			System.out.println("State : "+entry.getKey()+" "+"City : "+entry.getValue());
 			
 			
 			
 		}
 		
 		
 	}
}
