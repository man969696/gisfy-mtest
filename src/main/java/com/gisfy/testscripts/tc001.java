package com.gisfy.testscripts;

import org.testng.annotations.Test;
import com.gisfy.lib.General;

public class tc001 {
	//public static void main(String args[]) {
	@Test
	public void TC001() throws Exception 
	{
	 //test case step
		General obj = new General();
		obj.OpenApplication();
		obj.login();
	}
}
