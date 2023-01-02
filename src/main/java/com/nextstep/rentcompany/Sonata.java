package com.nextstep.rentcompany;

public class Sonata extends Car {

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 10;
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
        return "Sonata";
    }

}
