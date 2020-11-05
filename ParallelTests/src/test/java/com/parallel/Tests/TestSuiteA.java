package com.parallel.Tests;

import static org.testng.Assert.assertTrue;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.parallel.calc.Calculator;

public class TestSuiteA {
	Calculator calc;
	
	@BeforeClass
	public void Setup(ITestContext ctx ) {
		ctx.setAttribute("calc", new Calculator());
		this.calc = new Calculator();
	}
	
	
	@Test
	public void sumOfNumbers_001() throws InterruptedException {
		System.out.println("Executing Addition Test 001");
         Thread.sleep(1000);
 		assertTrue( calc.Add(3, 4)==7, "Addition of numbers incorrect");
		System.out.println("Addition Test 001 Done");

	}

	
	@Test
	public void sumOfNumbers_002() throws InterruptedException {
		System.out.println("Executing Addition Test 002");
        Thread.sleep(1000);

 		assertTrue( calc.Add(4, 4)==8, "Addition of numbers incorrect");
		System.out.println("Addition Test 002 Done");

	}
	
}
