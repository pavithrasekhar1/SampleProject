package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downcloads\\eclipse-committers-2019-03-R-win32-x86_64\\eclipse\\May30\\Day11\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	  driver.get("http://toolsqa.com/automation-practice-table/");
	}

}
