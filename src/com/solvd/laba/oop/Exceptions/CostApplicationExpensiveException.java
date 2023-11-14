package com.solvd.laba.oop.Exceptions;

public class CostApplicationExpensiveException extends Exception{
    public CostApplicationExpensiveException(){};
    public CostApplicationExpensiveException(String message){
        super(message);
    }
}
