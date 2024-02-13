package com.in28minutes.unit.testing.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringHelperTest {

	StringHelper helper = new StringHelper();

	@Test
	void testReplaceAInFirst2Positions_AssertEquals() {
		assertEquals("nif", helper.replaceAInFirst2Positions("Anif"));
		assertEquals("Edgar", helper.replaceAInFirst2Positions("Edgar"));
		assertEquals("aldo", helper.replaceAInFirst2Positions("aldo"));
		assertEquals("aaa", helper.replaceAInFirst2Positions("aaa"));
		assertEquals("", helper.replaceAInFirst2Positions("AA"));
		assertEquals("A", helper.replaceAInFirst2Positions("AAA"));
		assertEquals("123A", helper.replaceAInFirst2Positions("A123A"));
		
	}
	
	@Test
	void testReplaceAInFirst2Positions_AssertNotEquals() {
		assertNotEquals("Anif", helper.replaceAInFirst2Positions("Anif"));
	}
	
	
	// areFirstTwoAndLastTwoCharsTheSame
	
	@Test
	void testAreFirstTwoAndLastTwoCharsTheSame_assertTrue() {
		assertTrue(helper.areFirstTwoAndLastTwoCharsTheSame("ABCAB"));
		assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("HI"));
		assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("DDD"));
	}
	
	@Test
	void testAreFirstTwoAndLastTwoCharsTheSame_assertFalse() {
		assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("ABCDEMA"));
		assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame(""));
		assertFalse(helper.areFirstTwoAndLastTwoCharsTheSame("H"));
		
	}
	
	
}