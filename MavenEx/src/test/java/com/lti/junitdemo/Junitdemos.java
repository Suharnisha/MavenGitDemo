package com.lti.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import com.lti.demo.Calculator;

public class Junitdemos {
	@BeforeAll
    static void setup(){
        System.out.println("only once in beg - @BeforeAll executed\n");
    }     
    @BeforeEach
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }      
    @Test
    void testCalcOne() 
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }  
    //@Disabled
    @Test
    void testCalcTwo() 
    {
        System.out.println("======TEST TWO EXECUTED=======");
        Assertions.assertEquals( 6 , Calculator.add(2, 4));
    }    
    @AfterEach
    void tearThis(){
        System.out.println("@AfterEach executed");
    }     
    @AfterAll
    static void tear(){
        System.out.println("\n once aat the end - clean up @AfterAll executed");
    }

}
