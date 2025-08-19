package com.OLX.Exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor

public class OutOfStock extends Exception {

	public OutOfStock(String message) {
		super(message);
	}

}
