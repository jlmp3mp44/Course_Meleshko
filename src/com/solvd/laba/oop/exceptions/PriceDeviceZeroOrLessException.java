package com.solvd.laba.oop.exceptions;

public class PriceDeviceZeroOrLessException extends Exception{
    public PriceDeviceZeroOrLessException(){};
    public PriceDeviceZeroOrLessException(String message){
        super(message);
    }
}
