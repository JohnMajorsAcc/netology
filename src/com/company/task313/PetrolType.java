package com.company.task313;

public class PetrolType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
