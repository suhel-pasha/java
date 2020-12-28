package com.xworkz.java_programs.assignment;

public class InsufficientFundsException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // no-arg constructor ex
 public InsufficientFundsException(){
    super();
}

public InsufficientFundsException(String msg){
    // String-arg constructor
    super(msg);
}

}

