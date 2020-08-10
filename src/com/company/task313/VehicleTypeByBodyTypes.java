package com.company.task313;

public class VehicleTypeByBodyTypes extends VehicleType{

    public VehicleTypeByBodyTypes() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes vtbbt = (VehicleTypeByBodyTypes) object;
        return attribute != null ? attribute.equals(vtbbt.attribute) : false;
    }
}
