package com.xworkz.java_programs.assignment;

public class InvalidAmountException extends Exception {
     /**
    *
    */
    private static final long serialVersionUID = 1L;

    // no-arg constructor
   public InvalidAmountException(){ 
    super();
}

// String-arg constructor
public InvalidAmountException(String msg) {
super(msg);
}

}
