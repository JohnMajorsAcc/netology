package com.company.task313;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();

        VehicleAd volvoAd = new VehicleAd("Volvo", "123", new PassengerType(),
                new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", "45", new TruckType(),
                new PickupType(), new DieselType());
        VehicleAd gtrAd = new VehicleAd("GTR", "12", new CarType(), new SedanType(), new PetrolType());

        VehicleAd corollaAd = new VehicleAd("Corolla Wagon", "10", new CarType(), new WagonType(), new PetrolType());

        VehicleAd leafAd = new VehicleAd("Leaf", "2", new CarType(), new SedanType(), new ElectricType());

        VehicleAd liazAd = new VehicleAd("Liaz", "22", new PassengerType(), new BusType(), new PetrolType());

        VehicleAd[] vehicleList = new VehicleAd[] {volvoAd, kamazAd, gtrAd, corollaAd, leafAd, liazAd};

        adsService.setAdList(vehicleList);

        printAds(vehicleList);


        adsService.filterByVehicleTypeByPurpose(new PassengerType());

        adsService.filterByVehicleTypeByPurpose(new TruckType());

        adsService.filterByVehicleTypeByFuelType(new PetrolType());
    }

    private static void printAds(VehicleAd[] vehicleList) {
        Arrays.stream(vehicleList).forEach(System.out::println);
    }
}
