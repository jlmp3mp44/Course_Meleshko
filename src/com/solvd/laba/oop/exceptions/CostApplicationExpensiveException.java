package com.solvd.laba.oop.exceptions;

public class CostApplicationExpensiveException extends Exception{
    public CostApplicationExpensiveException(){};
    public CostApplicationExpensiveException(String message){
        super(message);
    }
}
