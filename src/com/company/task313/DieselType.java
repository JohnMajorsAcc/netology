package com.company.task313;

public class DieselType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
