package com.company.task341.myexceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("Access denied! User with this login/password wasn't found");
    }
}
