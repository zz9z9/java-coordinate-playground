package com.nextstep.rentcompany;

public class Avante extends Car {

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 15;
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return "Avante";
    }

}
