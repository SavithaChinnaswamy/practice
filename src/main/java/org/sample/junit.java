package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class junit extends BaseClass
{
	@Test
	public void tc_01() 
	{
		System.out.println("TC_01");
	}
	
	@Test
	public void tc_02() 
	{
		System.out.println("TC_02");
	}
	
	@Before
	public void StartDate()
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	@After
	public void endDate()
	{
		Date d = new Date();
		System.out.println(d);
	}
	
	@BeforeClass
	public static void launchthebrowser()
	{
		System.out.println("launch browser............");

	}
	
	@BeforeClass
	public static void closebrowser()
	{
		System.out.println("close browser............");

	}
	
	

}
