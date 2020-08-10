package com.company.task313;

import java.util.Arrays;
import java.util.Comparator;

public class AdsService {
    private VehicleAd[] adList;

    public AdsService() {
    }

    public AdsService(VehicleAd[] vehicleAdList) {
        this.adList = vehicleAdList;
    }

    public void filterByVehicleTypeByPurpose(VehicleTypeByPurpose vehicleType){


        for(VehicleAd ad : adList ){
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)){
                System.out.println("Объявление №" + ad.getId() + " подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + ")");
            } else {
                System.out.println("Объявление №" + ad.getId() + " не подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + "), так как авто имеет тип " + ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleTypeByBodyTypes vehicleType){
        for(VehicleAd ad : adList ){
            if (ad.getVehicleTypeByBodyTypes().equals(vehicleType)){
                System.out.println("Объявление №" + ad.getId() + " подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + ")");
            } else {
                System.out.println("Объявление №" + ad.getId() + " не подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + "), так как авто имеет тип " + ad.getVehicleTypeByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByFuelType(VehicleTypeByFuelType vehicleType){
        for(VehicleAd ad : adList ){
            if (ad.getVehicleTypeByFuelType().equals(vehicleType)){
                System.out.println("Объявление №" + ad.getId() + " подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + ")") ;
            } else {
                System.out.println("Объявление №" + ad.getId() + " не подходит под фильтр (тип авто : " + vehicleType.getTypeName() +
                        ", фильтр : " + vehicleType.getAttributeOfType() + "), так как авто имеет тип " + ad.getVehicleTypeByFuelType().getTypeName());
            }
        }
    }

    public void setAdList(VehicleAd[] adList) {
        this.adList = adList;
    }
}
