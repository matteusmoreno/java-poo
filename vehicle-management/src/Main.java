import domain.Car;
import domain.Motorcycle;
import domain.Vehicle;
import domain.VehicleManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var vehicleManagement = new VehicleManagement();

        ArrayList<Vehicle> vehicleList = new ArrayList<>();

        var veiculo = new Vehicle("Toyota", "Corolla", 2021, 97455.47);
        var moto = new Motorcycle("Honda", "Biz", 2012, 12458.47, 125, "Moto de Rua");
        var carro = new Car("Mitsubishi", "Pajero TR4", 2014, 39125.02, 4, 58.0);


        vehicleManagement.addVehicle(vehicleList, veiculo);
        vehicleManagement.addVehicle(vehicleList, moto);
        vehicleManagement.addVehicle(vehicleList, carro);



        var valorMedio = vehicleManagement.avaragePrice(vehicleList);

        System.out.println("Valor médio dos Veículos: R$" + valorMedio);





    }
}
