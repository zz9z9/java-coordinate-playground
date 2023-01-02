package com.nextstep.rentcompany;

public class K5 extends Car {

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 13;
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
        return "K5";
    }

}
