
package com.ahabana;

import org.openqa.selenium.WebDriver;

/*
 * Parent class browser
 */
public class Browser
{	
	// instance field
	protected  WebDriver driver;
	
	// setter for driver
	public void setDriver(WebDriver driver)
	{
		this.driver = driver;
	}	

	// getter for driver
	public WebDriver getDriver()
	{
		return this.driver;
	}

	// constructor
	public Browser()
	{

	}	

	public void start(String urgency)
	{	
		// build url
		StringBuilder url = new StringBuilder();
		url.append("http://");
		url.append("tstcpd201.");
		url.append("toyota.com/");
		// url.append("espanol/");
		url.append("camry/?qa=");
		url.append(urgency);
		url.append("&zipcode=90405");

		// go to built url
		driver.get(url.toString());

		// teardown
		driver.manage().deleteAllCookies();
		driver.close();
	}
}

