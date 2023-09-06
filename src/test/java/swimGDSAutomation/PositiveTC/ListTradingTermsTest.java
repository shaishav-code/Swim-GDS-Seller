package swimGDSAutomation.PositiveTC;

import org.openqa.selenium.ElementClickInterceptedException;
import org.testng.Assert;
import org.testng.annotations.Test;
import swimGDSAutomation.TestComponents.BaseClass;
import swimGDSAutomation.pageclass.LandingPage;
import swimGDSAutomation.pageclass.ListTradingTermsPage;
import swimGDSAutomation.pageclass.ManageTradingTermPage;

public class ListTradingTermsTest extends BaseClass{
	
	
	 String email="nda.norala@gmail.com";
	 String password= "Nikhil@86";
	 String expected="Term List";
  
	 //Verify if user is able to click on List trading terms section and is able to view the term lists
	 @Test(priority=1)
	 public void ClickListTermsAndViewTermsList() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 String actual = listtradingterms.Validationonpage();
	 Assert.assertEquals(actual, expected);

	 }
	 
	 //Verify if user is able to search the term by entering the code details
	 @Test(priority=2)
	 public void InsertTermsCodeInSearchField_ClickEnter() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Enterterms_search("Nik1234");

	 }
	 
	 //Verify if user is able to click on toggle button to Activate the Terms and click on No button
	 @Test(priority=3)
	 public void ChangeTheStatusToActivite_ClickNoBtn() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Entries("Nik1234");
	 Thread.sleep(3000);
	 listtradingterms.Click_no_btn();
	 
	 }
	 
	 
	 //Verify if user is able to click on toggle button to Activate the Terms and click on yes button
	 @Test(priority=4)
	 public void ChangeTheStatusToActivite_ClickYesBtn() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Entries("Nik1234");
	 Thread.sleep(3000);
	 listtradingterms.Click_yes_btn();
	 listtradingterms.Success_message();
	 
	 }
	 
	 //Verify if user is able to click on toggle button to deactivate the Terms and click on No button
	 @Test(priority=5)
	 public void ChangeTheStatusToDeactivite_ClickNoBtn() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Entries("Nik1234");
	 Thread.sleep(3000);
	 listtradingterms.Click_nobtn();
	 
	 }
	 
	 //Verify if user is able to click on toggle button to deactivate the Terms and click on Yes button
	 @Test(priority=6)
	 public void ChangeTheStatusToDeactivite_ClickYesBtn() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Entries("Nik1234");
	 Thread.sleep(3000);
	 listtradingterms.Click_yesbtn();
	 listtradingterms.Success_message();
	 
	 }
	 
	 String expected1 ="Create New Terms";
	 
	 //Verify if user is able to click on create new item button and is able to navigate to the Create New Trading terms page
	 @Test(priority=7)
	 public void ClickCreateNewItemsButton() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.Click_createnewitem();
	 String actual = listtradingterms.Validationonpage();
	 Assert.assertEquals(actual, expected1);
	 
	 }
	 
	 
	 //Verify if user is able to click on Pagination and if it is visible on DOM
	 @Test(priority=8)
	 public void ClickOnPagination() throws InterruptedException   {
		
	 LandingPage landingPage = new LandingPage(driver);
	 landingPage.SellerLogin();	
	 landingPage.Loginpage();
	 landingPage.Enter_useremail(email);
	 landingPage.Enter_password(password);
	 landingPage.Loginbtn();
	 ManageTradingTermPage managetradingterms = landingPage.ManageTradingTermOption();
	 ListTradingTermsPage listtradingterms = managetradingterms.ListTradingTermsPageOptions();
	 listtradingterms.scrolling();
     try {
    	     listtradingterms.Click_pagination();
			} catch (ElementClickInterceptedException e) {
				e.printStackTrace();
			}
	 
	 }
	 
	 

}