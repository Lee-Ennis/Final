package rocketBase;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import rocketDomain.RateDomainModel;

public class Rate_Test {

	
	// - RocketDAL rate_test
	//		Check to see if a known credit score returns a known interest rate
	
	//TODO - RocketDAL rate_test
	//		Check to see if a RateException is thrown if there are no rates for a given
	//		credit score
	@Test
	public void test() {
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		System.out.println ("Rates size: " + rates.size());
		assert(rates.size() > 0);
		
	}
	
	@Test
	public void rateTest(){
		
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
	
		assertTrue(rates.get(2).getdInterestRate() == 3.5 && rates.get(2).getiMinCreditScore() == 800);
		assertTrue(rates.get(3).getdInterestRate() == 4 && rates.get(3).getiMinCreditScore() == 700);
		assertTrue(rates.get(4).getdInterestRate() == 5 && rates.get(4).getiMinCreditScore() == 600);
	}
	
	
	
	

}
