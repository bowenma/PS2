package pkgInteger;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		MyInteger x1= new MyInteger(5);
		MyInteger x2= new MyInteger(9);
		MyInteger x3= new MyInteger(295);
		
		//Tests for boolean values
		assertTrue(x1.isEven());
		assertFalse(x1.isOdd());
		assertFalse(x1.isPrime());
		
		assertFalse(x2.isEven());
		assertTrue(x2.isOdd());
		assertFalse(x2.isPrime());
		
		assertFalse(x3.isEven());
		assertTrue(x3.isOdd());
		assertTrue(x3.isPrime());
		
		//Tests for integer values
		assertTrue(MyInteger.isEven(x1));
		assertFalse(MyInteger.isOdd(x1));
		assertFalse(MyInteger.isPrime(x1));
		
		assertFalse(MyInteger.isEven(x2));
		assertTrue(MyInteger.isOdd(x2));
		assertFalse(MyInteger.isPrime(x2));
		
		assertFalse(MyInteger.isEven(x3));
		assertTrue(MyInteger.isOdd(x3));
		assertTrue(MyInteger.isPrime(x3));
		
		
		assertTrue(x1.equals(x1));
		assertFalse(x1.equals(x2));

	}

}
