package project15;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();
        cars.add(new Car(CarMake.MERCEDES, "E-Class", 258));
        cars.add(new Car(CarMake.MERCEDES, "AMG GT", 585));
        cars.add(new Car(CarMake.BMW, "M5", 600));
        cars.add(new Car(CarMake.BMW, "X5", 381));
        cars.add(new Car(CarMake.AUDI, "A6", 245));
        cars.add(new Car(CarMake.AUDI, "RS6", 600));
        cars.add(new Car(CarMake.AUDI, "RS6", 600));
        System.out.println("От сильной к слабой:\n");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("======================================");
        System.out.println("самая мошная: " + Car.findFastestCar(cars));
        System.out.println("Самая слабая: " + Car.findSlowlyCar(cars));
        System.out.println("Все AUDI: " + Car.findCarsByMake(cars, CarMake.AUDI));
        System.out.printf("Средняя мощность всех авто = %.1f", Car.calcAvgPower(cars));
    }
}
