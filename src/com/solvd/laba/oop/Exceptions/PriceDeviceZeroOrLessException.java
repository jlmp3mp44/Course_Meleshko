package com.solvd.laba.oop.Exceptions;

public class PriceDeviceZeroOrLessException extends Exception{
    public PriceDeviceZeroOrLessException(){};
    public PriceDeviceZeroOrLessException(String message){
        super(message);
    }
}
