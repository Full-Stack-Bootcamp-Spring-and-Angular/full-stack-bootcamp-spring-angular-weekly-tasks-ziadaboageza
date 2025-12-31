package com.InjectingValues;

public class Car implements Vehicle{
    private DatabaseOperation databaseOperation;

    public Car(DatabaseOperation databaseOperation) {
        this.databaseOperation = databaseOperation;
    }

    @Override
    public void storeVehicle() {
        databaseOperation.storeVehicleNameIntoDataBase("Car");
    }

}
