
package com.ahabana;

import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome extends Browser
{
	public Chrome()
	{
		super();
		String path = "E:\\20151005\\pc\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		driver = new ChromeDriver();
		super.setDriver(driver);
	}
}
