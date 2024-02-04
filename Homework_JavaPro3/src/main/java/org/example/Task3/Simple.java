package org.example.Task3;

public class Simple {
    public static void main(String[] args) {
        Car car = new Car("BMW", 3, "Smt into", "WearBox", "wearEngine", true, 4, "somwhere");
        CarOwner carOwner = car;
        System.out.println("Машина эксплуатировалась: " + carOwner.getExploitationArea());
        Mechanic mechanic = car;
        System.out.println("Состояние двигателя: " + mechanic.getEngineCondition());
    }
}
