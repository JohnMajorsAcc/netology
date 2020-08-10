package com.company.task313;

public class VehicleAd {

    private String model;
    private String id;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleTypeByBodyTypes vehicleTypeByBodyTypes;
    private VehicleTypeByFuelType vehicleTypeByFuelType;

    public VehicleAd(String model, String id, VehicleTypeByPurpose vehicleTypeByPurpose, VehicleTypeByBodyTypes vehicleTypeByBodyTypes, VehicleTypeByFuelType vehicleTypeByFuelType) {
        this.model = model;
        this.id = id;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleTypeByBodyTypes = vehicleTypeByBodyTypes;
        this.vehicleTypeByFuelType = vehicleTypeByFuelType;
    }

    public VehicleAd(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getId() {
        return id;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleTypeByBodyTypes getVehicleTypeByBodyTypes() {
        return vehicleTypeByBodyTypes;
    }

    public VehicleTypeByFuelType getVehicleTypeByFuelType() {
        return vehicleTypeByFuelType;
    }

    @Override
    public String toString() {
        return "VehicleAd{" +
                "model='" + model + '\'' +
                ", id='" + id + '\'' +
                ", vehicleTypeByPurpose=" + vehicleTypeByPurpose.toString() +
                ", vehicleTypeByBodyTypes=" + vehicleTypeByBodyTypes.toString() +
                ", vehicleTypeByFuelType=" + vehicleTypeByFuelType.toString() +
                '}';
    }
}
