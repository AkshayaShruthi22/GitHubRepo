package com.folder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Employee {
	public static void main (String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sony\\eclipse-Akshaya\\DragAndDrop\\dry\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
	}
}
