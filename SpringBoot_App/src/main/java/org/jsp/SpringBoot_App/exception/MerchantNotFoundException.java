package org.jsp.SpringBoot_App.exception;

public class MerchantNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MerchantNotFoundException(String message) {
		super(message);
	}
}
