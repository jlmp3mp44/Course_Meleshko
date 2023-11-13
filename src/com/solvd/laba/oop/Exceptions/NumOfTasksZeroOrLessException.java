package com.solvd.laba.oop.Exceptions;

public class NumOfTasksZeroOrLessException extends Exception{
    public NumOfTasksZeroOrLessException(){};
    public NumOfTasksZeroOrLessException(String message){
        super(message);
    }
}
