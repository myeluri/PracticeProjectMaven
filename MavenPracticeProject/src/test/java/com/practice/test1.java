package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wheels.com/Public/default.aspx");
		System.out.println("Launching Wheels website");
	

	}

}
