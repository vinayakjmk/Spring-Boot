package com.boot;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.boot.controller.HomeController;
/**
 * Unit test for simple App.
 */
public class AppTest

{

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		HomeController hc =new HomeController();
		String op = hc.Home();
		assertEquals(op,"Hey Vinayak, Dude !..");
	}
}
