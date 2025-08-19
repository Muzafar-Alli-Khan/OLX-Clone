package com.OLX.Exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AlreadyExist extends RuntimeException
{
	public AlreadyExist(String message)
	{
		super(message);
	}

}
