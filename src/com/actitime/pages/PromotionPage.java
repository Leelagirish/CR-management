package com.actitime.pages;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generic.Basepage;

public class PromotionPage extends Basepage

{
	//declaration
	
	

	@FindBy(id="createNew")
	private WebElement createnew;
	
	@FindBy(id="submenu_Campaigns")
	private WebElement subcreate;
	
	@FindBy(id="Crm_Campaigns_CAMPAIGNNAME_label")
	private WebElement PromoteName;
	
	@FindBy(xpath="//span[.='November 2017']/../../..//td[.='22']")
	private WebElement StartDate;
	
	@FindBy(id="saveCampaignsBtn_Bottom")
	private WebElement save;
	
	//initialization
	
	public PromotionPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void createnew()
	{
		createnew.click();
	}
	public void subcrete()
	{
		subcreate.click();
	}
	public void promotename(String PN)
	{
		
		PromoteName.sendKeys(PN);
	}
	
	public void StartDate()
	{
		Date date=new Date();
		SimpleDateFormat s1=new SimpleDateFormat("d");
		SimpleDateFormat s2=new SimpleDateFormat("mmmm");
		String day=s1.format(date);
		String month=s2.format(date);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
        StartDate.click();
				
	}
	public void save1() 
	{
		save.click();
	}

	

	
	
	
	
	
	
	
	
	
	
	
	

}
