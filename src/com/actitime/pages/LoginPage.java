package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class LoginPage extends Basepage
{

	@FindBy(xpath="//a[.='LOGIN']")
	private WebElement login;
	
	@FindBy(id="lid")
	private WebElement Email;
	
	@FindBy(id="pwd")
	private WebElement pwd;
	
	@FindBy(id="signin_submit")
	private WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void loginn()
	{
		login.click();
	}
	public void email(String EM)
	{
		
		Email.sendKeys(EM);
	}
	public void pwd(String pw)
	{
		
		pwd.sendKeys(pw);
	}
	public void sign()
	{
		signin.click();
	}
	
	
	
	
	

	

}
