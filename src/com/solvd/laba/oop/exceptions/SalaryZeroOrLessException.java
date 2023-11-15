package com.solvd.laba.oop.exceptions;

public class SalaryZeroOrLessException extends Exception{
    public SalaryZeroOrLessException(){}
    public SalaryZeroOrLessException(String message){
        super(message);
    }
}
