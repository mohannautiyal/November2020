package com.parallel.Tests;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parallel.calc.Calculator;

public class TestSuiteB {
	Calculator calc;
	
	@BeforeClass
	public void Setup() {
		
		this.calc = new Calculator();
	}
	

	@Test
	public void substractionOfNumbers_001() throws InterruptedException {
		System.out.println("Executing Substraction Test 001");
        Thread.sleep(1000);

 		assertTrue( calc.Substract(7,3)==4, "Substraction of numbers incorrect");
		System.out.println("Substraction Test 001 Done");

	}

	
	@Test
	public void substractionOfNumbers_002() throws InterruptedException {
		System.out.println("Executing Substraction Test 002");
        Thread.sleep(1000);

 		assertTrue( calc.Substract(4, 4)==0, "Substraction of numbers incorrect");
		System.out.println("Substraction Test 002 Done");

	}
	
	
	
}
