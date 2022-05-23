package com.gisfy.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class General extends Global {
	
public void OpenApplication() throws Exception
  {
	System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.navigate().to(url);
	System.out.println("Application Opened");
	Thread.sleep(3000);
	Reporter.log("Application opened");
  }
	
public void login() throws Exception 
  {
	    driver.findElement(By.xpath(u_name)).sendKeys(un);
	    driver.findElement(By.name(p_word)).sendKeys(up);
	    driver.findElement(By.xpath(c_box)).click();
	    driver.findElement(By.xpath(sign_btn)).click();
	    System.out.println("Sign completed");
	    Reporter.log("Sign completed");
	    Thread.sleep(3000);
  }

public void user_management() throws InterruptedException 
  {
	Thread.sleep(3000);
	driver.navigate().to("http://13.127.254.146/usermanagement");
	
  }

public void new_user() throws InterruptedException 
  {
	driver.findElement(By.xpath(add_n_user)).click();
	Thread.sleep(3000);
    Select st = new Select(driver.findElement(By.xpath("//*[@id=\"role\"]")));
	st.selectByVisibleText("TestUser17");
	
	driver.findElement(By.xpath(us_name)).sendKeys(uname); 
	driver.findElement(By.xpath(us_pass)).sendKeys(upass);
	driver.findElement(By.name(us_Fn)).sendKeys(Fn);
	driver.findElement(By.name(us_Ln)).sendKeys(Ln);
	driver.findElement(By.name(us_MoNo)).sendKeys(MoNo);
	driver.findElement(By.xpath(us_Email)).sendKeys(Email);
	
	Select st1 = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]")));
	st1.selectByVisibleText("MAHARASHTRA");
	Thread.sleep(3000);
	
	Select st2 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[4]/div[2]/div/div/select")));
	st2.selectByValue("NAGPUR");
	Thread.sleep(3000);
	
	Select st3 = new Select(driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[4]/div[3]/div/div/select")));
	st3.selectByValue("Ramtek");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(us_Addr)).sendKeys(Addr); 
	driver.findElement(By.xpath(submit_btn)).click();
	Thread.sleep(3000);
	
	System.out.println("New User Details Entered Successfully");
	Reporter.log("New User Details Entered Successfully");
	Thread.sleep(3000);
  }

public void edit_bt() 
  { 
	driver.navigate().to("http://13.127.254.146/usermanagement/8/edit");
	System.out.println("Edit Successfully");
	Reporter.log("Edit Successfully");
  }

public void delete_bt() 
  {
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/div/div[2]/div/table/tbody/tr[5]/td[10]/form/button/i"));
	System.out.println("Delete Successfully");
	Reporter.log("Delete Successfully");
   }
}
