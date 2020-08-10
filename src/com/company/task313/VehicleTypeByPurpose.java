package com.company.task313;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose vtbp = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(vtbp.attribute) : false;
    }


}
