package com.lti.demo;

public class Except {
	public static void main(String[] args)   {
		try   {
			int n= Integer.parseInt("100abc");
		}
		catch(NumberFormatException e)   {
			System.out.println(e.getMessage());
		}
		
	}

}
