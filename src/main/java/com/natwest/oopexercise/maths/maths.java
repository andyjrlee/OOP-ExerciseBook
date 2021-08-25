package com.natwest.oopexercise.maths;

public class maths {
	
	public static int add(int a, int b){
	    return (a + b);
	}
	    
	public static int multiply(int a, int b) {
		    return (a * b);
	}
		    public static int subtract(int a, int b) {
			    return (a - b);	    }
	    
			    public static double divide(double c, double d) {
			    	if (c < d) {
			    		System.out.println("Division cannot be performed");
					} else {
						 System.out.println(c/d);	
					}
			    	
				    return (c / d);
				    }
	

	public static void main (String [] arg){
	    int a = 13; 
	    int b = 2;
	    double c = 2;
	    double d = 13;
	    
	    System.out.println(add(a, b));
	    System.out.println(multiply(a, b));
	    System.out.println(subtract(a, b));
	    System.out.println(divide(c, d));
	}
}
