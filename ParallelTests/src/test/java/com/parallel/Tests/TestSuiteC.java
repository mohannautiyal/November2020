package com.parallel.Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parallel.calc.Calculator;

public class TestSuiteC {

  Calculator calc;
	
	@BeforeClass
	public void Setup() {
		
		this.calc = new Calculator();
	}

	@Test
	public void divisionOfNumbers_001() throws InterruptedException {
		System.out.println("Executing Division Test 001...");
        Thread.sleep(3000);

 		assertTrue( calc.Divide(8,2)==4, "Division of numbers incorrect");
		System.out.println("Division Test 001 Done");

	}

	
	@Test
	public void divisionOfNumbers_002() throws InterruptedException {
		System.out.println("Executing Division Test 002..");
        Thread.sleep(3000);

 		assertTrue( calc.Divide(9,3)==3, "Division of numbers incorrect");
		System.out.println("Division Test 002 Done");

	}
}
