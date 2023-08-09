package domain;

import java.util.ArrayList;

public class VehicleManagement {

    public double avaragePrice(ArrayList<Vehicle> arrayList) {

        double valorTotal = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
            valorTotal += arrayList.get(i).getPrice();
        }

        return valorTotal / arrayList.size();
    }

    public void addVehicle(ArrayList<Vehicle> array, Vehicle vehicle) {
        array.add(vehicle);
    }
}
