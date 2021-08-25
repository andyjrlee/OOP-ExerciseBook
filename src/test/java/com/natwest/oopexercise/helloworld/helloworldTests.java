package com.natwest.oopexercise.helloworld;

import org.junit.jupiter.api.Test;

public class helloworldTests {

	
	@Test
	public static void main(String[] args) {
		helloMethod("Andy");
		
		System.out.println("Hello World!");

var string = "Hello World!";
	System.out.println(string);
	
	}
	
	static void helloMethod(String name) {
		System.out.println("Hello World, " + name);
}
}
