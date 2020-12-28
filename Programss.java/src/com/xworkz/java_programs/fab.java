package com.xworkz.java_programs;

public class fab {
	
		static int fib (int num) {
        if(num == 1)
        	return 0;
        else if(num == 2) 
        	return 1;
        	else {
        	
        		return fib(num-1)+fib(num-2);
        	}
        }

	

		}

