package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	// - RocketBLL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	// - RocketBLL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void rateTest1() { // Test example given in wordDoc
		assertEquals(RateBLL.getPayment((.04/12), 360, 300000, 0, false), -1432.245, 2);
	}
	
	@Test(expected = RateException.class)
	public void rateExceptionTest() throws RateException{
		RateBLL.getRate(1000);
	}
}
