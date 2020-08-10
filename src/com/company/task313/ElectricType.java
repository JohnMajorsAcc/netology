package com.company.task313;

public class ElectricType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
