package com.nextstep.rentcompany;

import java.util.ArrayList;
import java.util.List;

public class RentCompany implements Company {

    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> managingCars = new ArrayList<>();

    @Override
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        for (Car c : this.managingCars) {
            sb.append(String.format("%s : %d리터%s", c.getName(), (int) c.getChargeQuantity(), NEWLINE));
        }

        return sb.toString();
    }

    @Override
    public void addCar(Car car) {
        this.managingCars.add(car);
    }
}
