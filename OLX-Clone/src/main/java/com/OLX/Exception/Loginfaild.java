package com.OLX.Exception;

import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
public class Loginfaild extends Exception {
	
	public Loginfaild(String messge)
	{
		super(messge);
		
	}
	
	

}
