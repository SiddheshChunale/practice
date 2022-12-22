package com.liveproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	Chromedriver driver = null;
	public void login() {
		System.out.println("in class a");
	}
	
	public void similar() {
		String s = "siddhesh";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				
			}
		}
	}
	public void invokeBrowser() {
		System.setProperty("", null);//chrome path
		driver = new ChromeDriver;
		
	}
}
