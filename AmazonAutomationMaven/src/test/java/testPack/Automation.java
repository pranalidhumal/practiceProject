package testPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {

	 @BeforeSuite
     public void beforeSuite() {
    
	       System.out.println("Before Suite - Automation");
     }
     @BeforeTest
     public void beforeTest()
		{
			System.out.println("Before Test - Automation");
		}
		
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("Before Class - Automation");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("Before Method - Automation");
		}
		@Test
		public void testA()
		{
			System.out.println("Test - A - Automation"); 
		}
		@Test
		public void testB()
		{
			System.out.println("Test - B - Automation"); 
		}
		@Test
		public void testC()
		{
			System.out.println("Test - C - Automation"); 
		}
		@Test
		public void testD()
		{
			System.out.println("Test - D - Automation"); 
		}
		
		@AfterMethod
		public void afterMethod()
		{
			System.out.println("After Method - Automation");
		}
		@AfterClass
		public void afterClass()
		{
			System.out.println("After Class - Automation");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test - Automation");
		}
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After Suite - Automation");
		}
	}



	

