package com.masai;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Details {

	private String countryName;
	private Properties StateCity;

	
 	public String getCountryName() {
		return countryName;
	}


	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public Properties getStateCity() {
		return StateCity;
	}


	public void setStateCity(Properties stateCity) {
		StateCity = stateCity;
	}


	public void detailShow() {
 		System.out.println("Country Name : "+countryName);
        
 	 	Set<Entry<Object,Object>> entries= StateCity.entrySet(); 	 	
 		
 	 	for(Entry<Object,Object> entry:entries) {
 	 		
 	 		System.out.println("State Name : "+entry.getKey());
 	 		
 	 	}
 	 	
 	 	
 		
 	}
}
