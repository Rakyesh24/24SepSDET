package redifftest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Login;
import pages.Mail;

public class TC_1 {
	WebDriver driver;
	Login lp;
	Mail mp;
  @Test
  public void f() {
	  String mailto="joy.1686@rediffmail.com";
	  String subject="hi";
	  String message="Sending mail from selenium webdriver";
	  mp.doComposeAs(mailto, subject, message);
  }
  
  @BeforeTest
  public void setup() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  lp=new Login(driver);
	  lp.openUrl();
	  lp.doLoginAs("rth143", "rock12");
	  lp.skiplogin();
	  mp=new Mail(driver);
	  //changed 
  }
}
