package com.beanScopes;

public class DatabaseOperations {
    public void connectToDatabase(){
        System.out.println(String.format("connection to database established ……"));
    }
    public void disconnectFromDatabase(){
        System.out.println(String.format("connection to database closed……"));
    }

}
