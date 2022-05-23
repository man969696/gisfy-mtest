package com.gisfy.testscripts;

import org.testng.annotations.Test;
import com.gisfy.lib.General;

public class tc003 {
	//public static void main(String args[]) {
	@Test
	public void TC003() throws Exception 
	{
	 //test case step
		General obj = new General();
		obj.OpenApplication();
		obj.login();
		obj.user_management();	
		obj.edit_bt();
    }
}
