package com.company.task341.myexceptions;

public class AccessDeniedException extends Exception{
    public AccessDeniedException(){
        super("Access denied! Age isn't correct.");
    }
}
