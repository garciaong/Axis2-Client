package com.insurance.motor;

public class MotorServiceClient {

	public static void main(String[] args) throws Exception {
		// Create the stub object
		MotorServiceStub stub = new MotorServiceStub();

		// Create the request
		MotorServiceStub.GetQuote getQuote = new MotorServiceStub.GetQuote();

		// Set the parameters
		getQuote.setType("gold");

		// Invoke the service
		MotorServiceStub.GetQuoteResponse response = stub.getQuote(getQuote);
		double quote = response.get_return();
		System.out.println("Quote : " + quote);
		
		// Set the parameters
		getQuote.setType("basic");

		// Invoke the service
		MotorServiceStub.GetQuoteResponse response2 = stub.getQuote(getQuote);
		double quote2 = response2.get_return();
		System.out.println("Quote : " + quote2);
	}

}
