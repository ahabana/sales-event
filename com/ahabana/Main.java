
package com.ahabana;

import org.testng.annotations.Test;

/*
 * This script validates mlp urgency test
 * validates presence of "Days" text
 * badge and countdown icon
 */
public class Main
{
	@Test
	public void test()
	{
		// call urgency tests
		Browser browsera = new Chrome();
		browsera.start("a");

		Browser browserb = new Chrome();
		browserb.start("b");

		Browser browserc = new Chrome();
		browserc.start("c");
	}
}


