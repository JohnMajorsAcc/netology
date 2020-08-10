package com.company.task313;

public class HybridType extends VehicleTypeByFuelType{
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}
