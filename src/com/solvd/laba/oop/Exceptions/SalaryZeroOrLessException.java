package com.solvd.laba.oop.Exceptions;

public class SalaryZeroOrLessException extends Exception{
    public SalaryZeroOrLessException(){}
    public SalaryZeroOrLessException(String message){
        super(message);
    }
}
