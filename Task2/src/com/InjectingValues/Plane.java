package com.InjectingValues;

public class Plane implements Vehicle{

    private DatabaseOperation databaseOperation;

    @Override
    public void storeVehicle() {
        databaseOperation.storeVehicleNameIntoDataBase("Plane");
    }
    public void setDatabaseOperation(DatabaseOperation databaseOperation){
        this.databaseOperation=databaseOperation;
    }
}
