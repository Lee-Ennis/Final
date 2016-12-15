package rocketBase;

import java.util.ArrayList;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	public static double getRate(int GivenCreditScore) throws RateException
	{
		ArrayList<RateDomainModel> rates = RateDAL.getAllRates();
		
		for (int r = 0; r < rates.size(); r++){
			if(rates.get(r).getiMinCreditScore() <= GivenCreditScore);
			{
				return rates.get(r).getdInterestRate();
			}
		}
		//     - RocketBLL RateBLL.getRate - make sure you throw any exception
		
		//		Call RateDAL.getAllRates... this returns an array of rates
		//		write the code that will search the rates to determine the 
		//		interest rate for the given credit score
		//		hints:  you have to sort the rates...  you can do this by using
		//			a comparator... or by using an OrderBy statement in the HQL
		throw new RateException(1);
		
		// - RocketBLL RateBLL.getRate
		//			obviously this should be changed to return the determined rate
		
		
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t); // r = rate, n = number of payments, p = present value
		                                      // f = future value
	}
}
