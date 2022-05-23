package com.gisfy.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	public WebDriver driver;
	
//test Data
	public String url ="http://13.127.254.146/";
    public String un ="testuser";
	public String up ="pass@123";
	public String uname ="testman";
	public String upass ="pass@123";
	
	public String Fn ="BOB";
	public String Ln ="ALEX";
	public String MoNo ="7272721212";
	public String Email ="balex123@gmail.com";
	public String Addr ="Future Road, T square, Maharashtra";
	
//objects	
	public String u_name ="/html/body/div[1]/div[2]/div/form/div[1]/input";
	public String p_word ="password";
	public String c_box ="//*[@id=\"remember\"]";
	public String sign_btn ="/html/body/div[1]/div[2]/div/form/div[3]/div[2]/button";
	
//add user functionalities	
	public String add_n_user ="/html/body/div[1]/div[1]/section/div/section/div/div/div[1]/div/a";
	public String us_name ="/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[1]/div[2]/div/div/input";
	public String us_pass ="/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[1]/div[3]/div/input";
	
	public String us_Fn ="firstname";
	public String us_Ln ="lastname";
	public String us_MoNo ="phonenumber";
	public String us_Email ="/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[3]/div[2]/div/div/input";
	public String us_Addr ="/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[5]/div/div/div/textarea";
	
    public String submit_btn = "/html/body/div[1]/div[1]/section/div/section/div/div/div[2]/form/div[6]/div[1]/div/button";
}