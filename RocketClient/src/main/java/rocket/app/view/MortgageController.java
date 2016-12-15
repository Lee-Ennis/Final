package rocket.app.view;

import eNums.eAction;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import rocket.app.MainApp;
import rocketCode.Action;
import rocketData.LoanRequest;

public class MortgageController {

	private MainApp mainApp;
	
	//	TODO - RocketClient.RocketMainController
	
	//	Create private instance variables for:
	//		TextBox  - 	txtIncome
	//		TextBox  - 	txtExpenses
	//		TextBox  - 	txtCreditScore
	//		TextBox  - 	txtHouseCost
	//		ComboBox -	loan term... 15 year or 30 year
	//		Labels   -  various labels for the controls
	//		Button   -  button to calculate the loan payment
	//		Label    -  to show error messages (exception throw, payment exception)
	@FXML 
	private Label Income;
	
	@FXML 
	private Label Expenses;
	
	@FXML 
	private Label CreditScore;
	
	@FXML 
	private Label HouseCost;
	
	@FXML 
	private Label Term;
	
	@FXML 
	private Label MortgagePayment;
	
	@FXML
	private Label lblMortgagePayment;
	
	@FXML 
	private Label Error;
	
	@FXML 
	private Label ErrorWarning;
	
	@FXML 
	private TextField txtIncome;
	
	@FXML 
	private TextField txtExpenses;
	
	@FXML 
	private TextField txtCreditScore;
	
	@FXML 
	private TextField txtHouseCost;
	
	@FXML 
	private ComboBox cmbTerm;
	
	@FXML
	private void comboBoxTerm() {
		cmbTerm.getItems().add("15 year");
		cmbTerm.getItems().add("30 Year");
	}
	
	@FXML 
	private Button Calculate;

	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	
	//	TODO - RocketClient.RocketMainController
	//			Call this when btnPayment is pressed, calculate the payment
	@FXML
	public void btnCalculatePayment(ActionEvent event)
	{
		Object message = null;
		//	TODO - RocketClient.RocketMainController
		
		Action a = new Action(eAction.CalculatePayment);
		LoanRequest lq = new LoanRequest();
		
		lq.setIncome(Double.parseDouble(txtIncome));
		//	TODO - RocketClient.RocketMainController
		//			set the loan request details...  rate, term, amount, credit score, downpayment
		//			I've created you an instance of lq...  execute the setters in lq

		a.setLoanRequest(lq);
		
		//	send lq as a message to RocketHub		
		mainApp.messageSend(lq);
	}
	
	public void HandleLoanRequestDetails(LoanRequest lRequest)
	{
		//	TODO - RocketClient.HandleLoanRequestDetails
		//			lRequest is an instance of LoanRequest.
		//			after it's returned back from the server, the payment (dPayment)
		//			should be calculated.
		//			Display dPayment on the form, rounded to two decimal places
		
	}
}
