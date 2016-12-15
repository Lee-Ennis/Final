package exceptions;

public class RateException extends Exception {
	
	private int RateDomainModel;
	
	public RateException(int rdm){
		super("No rate found for: " + rdm);
		
		this.RateDomainModel = rdm;
	}

	public String getRateExceptionM() {
		return this.getMessage();
	}

	//	TODO - RocketBLL RateException - RateDomainModel should be an attribute of RateException
	//	* Add RateRomainModel as an attribute
	//	* Create a constructor, passing in RateDomainModel
	//	* Create a getter (no setter, set value only in Constructor)
}
