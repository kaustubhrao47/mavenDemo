package com.utility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValidationTest {
	
	Validation validation;
	@Before
	public void init() {
		validation=new Validation();
	}
	@Test
	public void testValidEmail1() {
		assertEquals(true,validation.validateEmail("kaustubhrao47@gmail.com"));
	}
	@Test
	public void testValidEmail2() {
		assertEquals(false,validation.validateEmail("kaustubhrao47gmail.com"));
	}
	@Test
	public void testValidPhone1() {
		assertFalse(validation.validatePhone("98-76-54-32-10"));
	}
	@Test
	public void testValidPhone2() {
		assertTrue(validation.validatePhone("9876543210"));
	}
}
