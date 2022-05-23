package com.gisfy.testscripts;

import org.testng.annotations.Test;
import com.gisfy.lib.General;

public class tc002 {
	//public static void main(String args[]) {
	@Test
	public void TC002() throws Exception 
	{
	 //test case step
		General obj = new General();
		obj.OpenApplication();
		obj.login();
		obj.user_management();	
		obj.new_user();
	}
}