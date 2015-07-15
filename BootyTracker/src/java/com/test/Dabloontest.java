package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.base.Dabloonexchange;

public class Dabloontest {

	@Test
	public void testConvert() {
		double num = Dabloonexchange.convert(40);
		assertEquals(4, num, 0);
	}
	
	@Test
	public void textStringConvert() {
		String num = Dabloonexchange.convert("40");
		assertEquals("4.0", num);
	}

}
