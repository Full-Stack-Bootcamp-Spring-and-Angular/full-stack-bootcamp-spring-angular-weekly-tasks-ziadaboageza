package com.InjectingValues;

public class DatabaseOperation {
    private String url;
    private String username;
    private String password;
    DatabaseOperation (String url , String username ,String password){
        this.url=url;
        this.username=username;
        this.password=password;
    }

    public void storeVehicleNameIntoDataBase(String vehicleName){
        System.out.println(String.format("Connecting the Database which is Url = %s , Username = %s , Password = %s" , url , username , password));
        System.out.println(String.format("Storing %s at Database" , vehicleName));
    }
}
