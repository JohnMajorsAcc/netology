package com.company.task313;

public class VehicleTypeByFuelType  extends  VehicleType{
    public VehicleTypeByFuelType() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByFuelType vtbft = (VehicleTypeByFuelType) object;
        return attribute != null ? attribute.equals(vtbft.attribute) : false;
    }
}

