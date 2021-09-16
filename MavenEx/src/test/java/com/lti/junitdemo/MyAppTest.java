package com.lti.junitdemo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;
import com.lti.demo.MyApp;
import com.lti.demo.Product;

class MyAppTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testshow()  {
		MyApp m= new MyApp();
		String s=m.show();
		Assertions.assertEquals("Hello Maven", s);
	}
	@Test
	void testAdd()   {
		int r=Calculator.add(100,200);
		Assertions.assertEquals(300, r);
		Assertions.assertEquals(100, Calculator.add(50,50),"Testing Add method");
		Assertions.assertNotEquals(30, r);
	}
	
	@Test
	void testAssertFalse()  {
		Assertions.assertFalse("FirstName".length()==10);
		Assertions.assertFalse(10>20,"Comparing two values");
	}
	
	@Test
	void testAssertNull()  {
		String s1=null;
		String s2="abc";
		Assertions.assertNull(s1);
		
	}
	
	@Test
	void testAssertAll()   {
		String str1="abc";
		String str2="pqr";
		String str3="xyz";
		Assertions.assertAll(
				()->Assertions.assertEquals(str1, "abc"),
				()->Assertions.assertEquals(str2, "pqr"),
			    ()->Assertions.assertEquals(str3, "xyz")

                  );
	}
	
	@Test
	void testCollections()   {
		ArrayList<String> myList= new ArrayList<>();
		myList.add("hello");
		Assertions.assertFalse(myList.isEmpty());
		ArrayList<String> myList1= new ArrayList<>();
		Assertions.assertEquals(false, myList.isEmpty());
		
	}
	
	@Test
	public void testCompanyName() {
		Product p = new Product(101,"charger",10000.00,"Dmart");
		Assertions.assertEquals("Dmart",p.getCompanyName());
	}
	
	@Test
	public void testExceptions() {		
		
	    Exception exception = Assertions.assertThrows(NumberFormatException.class, () -> {
	        Integer.parseInt("100assff");
	        });

	    String expectedMessage = "For input string";
	    String actualMessage = exception.getMessage();
	    Assertions.assertTrue(actualMessage.contains(expectedMessage));
	   // Assertions.assertEquals(expectedMessage,actualMessage);
	    
	}	
	
	 @Test
	 void testAssumeTrue() {
	      boolean b = "A" == "A";
	      Assumptions.assumeTrue(b);
	     // Assertions.assertEquals("Hello", "Hello");
	 }

	
	 @Test
	 void testAssumeFalse() {
	      boolean b = 'A' != 'A';
	      Assumptions.assumeFalse(b);
	      Assertions.assertEquals("Hello", "Hello");
	 }

}
