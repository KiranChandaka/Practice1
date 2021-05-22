package com.kiran.maven.test;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Operations {

	int a = 20, b = 10;

	@Test
	public void Add() {

		Assert.assertEquals(30, a + b);
	}

	@Test
	public void Sub() {
		Assert.assertEquals(10, a - b);
	}

	@Test
	public void Mul() {
		Assert.assertEquals(200, a * b);
	}

	@Test
	public void Div() {
		Assert.assertEquals(2, a / b);
	}

}
