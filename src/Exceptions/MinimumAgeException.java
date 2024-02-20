package Exceptions;

public class MinimumAgeException extends Exception{
    public MinimumAgeException(String argMessage){
        //super makes it send to the extended class
        super(argMessage);
    }
}
