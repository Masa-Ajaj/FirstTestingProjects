package firsttestngproject;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.calculator.Calculator;

public class calcTester {
  @Test(priority = 0)
  public void testAdd() {
	  System.out.println("testAdd");
	  assertEquals(Calculator.add(1.2, 3.8), 5);
  }
  
  @Test(priority = 1)
  public void testSub() {
	  System.out.println("testSub");
	  assertEquals(Calculator.subtract(3.5, 0.5), 3);
  }
  
  @Test(priority = 2)
  public void testDiv() {
	  System.out.println("testDiv");
	  assertEquals(Calculator.divide(5, 2), 2.5);
  }
  
  @Test(expectedExceptions = { ArithmeticException.class}, priority = 3)
  public void testDivExcep() {
	  System.out.println("testDivExcep");
	  assertEquals(Calculator.divide(5, 0), 1);
  }
  
  @Test(priority = 2)
  public void testSquRoot() {
	  System.out.println("testSquRoot");
	  assertEquals(Calculator.squareRoot(4.4), 2.0976);
  }
  

  
  @Test(expectedExceptions = { ArithmeticException.class})
  public void testSquRootExcep() {
	System.out.println("defult priority is 1");
	  assertEquals(Calculator.squareRoot(-6), 1);
  }
  
  @Test
  public void testPrimes() {
	  assertFalse(Calculator.isPrime(10));
  }
  
  @Test 
  public void testOdd() {
	  assertTrue(Calculator.isOdd(3));
  }
  
  @Test 
  public void testEven() {
	  assertTrue(Calculator.isEven(6));
  }
  
  @Test 
  public void testExpo() {
	  assertEquals(Calculator.exponential(2.5, 6), 244.1406);
  }
  
  @Test(priority = 0)
  public void testGCD() {
	  System.out.println("testGCD");
	  assertEquals(Calculator.greatestCommonDivisor(156,336), 12);
  }
  
  @Test(priority = 2)
  public void testSquar() {
	  System.out.println("testSquar");
	  assertEquals(Calculator.squar(6), 36);
  }
  
  @Test(priority = 3)
  public void testMul() {
	  System.out.println("testMul");
	  assertEquals(Calculator.multiply(5, 8), 40);
  }
  
  @Test
  public void testFact() {
	  assertEquals(Calculator.factorial(4), 24);
  }
  
  @Test 
  public void testMod() {
	  assertEquals(Calculator.mod(9, 5), 4);
  }
}
