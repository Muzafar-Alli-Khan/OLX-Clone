package com.OLX.Exception;

import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@NoArgsConstructor
public class OutOfStock extends Exception {

	public OutOfStock(String message) {
		super(message);
	}

}
