package com.solvd.laba.oop.exceptions;

public class NumOfTasksZeroOrLessException extends Exception{
    public NumOfTasksZeroOrLessException(){};
    public NumOfTasksZeroOrLessException(String message){
        super(message);
    }
}
