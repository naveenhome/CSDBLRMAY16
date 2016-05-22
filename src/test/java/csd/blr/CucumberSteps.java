package csd.blr;

import junit.framework.TestCase;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberSteps extends TestCase{
	PatientData patientdata = new PatientData();
	String actionButton;
	@Given("^patient has enetered all correct data$")
	public void patient_has_enetered_all_correct_data() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		patientdata.setPatientName("Abc");
		patientdata.setDoctorName("XYZ");
		patientdata.setVisitDate("31/03/2016");
		patientdata.setVisittime("4.30pm");
	}

	@Given("^patient has enetered name as \"([^\"]*)\", doctor name as \"([^\"]*)\", date as \"([^\"]*)\" and time is \"([^\"]*)\"$")
	public void preCondition(String pName, String dName, String vDate, String vTime) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		patientdata.setPatientName(pName);
	}

	@Given("^paient is trying to add same record again name as \"([^\"]*)\", doctor name as \"([^\"]*)\", date as \"([^\"]*)\" and time is \"([^\"]*)\"$")
	public void duplicateTest(String pName, String dName, String vDate, String vTime) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^click on \"([^\"]*)\"$")
	public void actionSteps(String actionButton) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
		actionButton=this.actionButton;
		
	}
	@When("^click on Submit$")
	public void actionSteps() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    //throw new PendingException();
	}

	@Then("^System display \"([^\"]*)\"$")
	public void expectedResult(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    if(actionButton.equals("Submit"))
	    {
	    	PatientBLL obj = new PatientBLL();
	    	assertEquals(arg1, obj.validate(patientdata));
	    }
	    else if(actionButton.equals("Submit"))
	    {
	    	
	    }
	}

	@Given("^paient is trying to add same record again$")
	public void duplicateRecordCheck() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}


}
