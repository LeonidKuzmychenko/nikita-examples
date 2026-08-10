package project15;

import java.util.*;

public class Car {
    private final String model;
    private final int power;
    private final CarMake carMake;

    public Car(CarMake carMake, String model, int power) {
        this.model = model;
        this.power = power;
        this.carMake = carMake;
    }

    public CarMake getCarMake() {
        return carMake;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return this.power == car.power && Objects.equals(model, car.model) && carMake == car.carMake;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, carMake);
    }

    @Override
    public String toString() {
        return carMake + " " + model +
                ", power = " + power;
    }

    //    @Override
//    public int compareTo(Car o) {
//        int powerCompare = Integer.compare(o.power, this.power);
//        if (powerCompare != 0) {
//            return powerCompare;
//        }
//        int makeCompare = o.carMake.compareTo(this.carMake);
//        if (makeCompare != 0) {
//            return makeCompare;
//        }
//        return o.model.compareTo(this.model);
//    }
    public static double calcAvgPower(Collection<Car> cars) {
        if (cars == null || cars.isEmpty()) {
            return 0.;
        }
        int totalPower = 0;
        for (Car car : cars) {
            totalPower += car.getPower();
        }
        return (double) totalPower / cars.size();
    }

    public static List<Car> findFastestCar(Collection<Car> cars) {
        if (cars == null || cars.isEmpty()) {
            return new ArrayList<>();
        }
        List<Car> buffMaxPowerCars = new ArrayList<>();
        for (Car car : cars) {
            //2
            if (buffMaxPowerCars.isEmpty() || car.getPower() > buffMaxPowerCars.get(0).getPower()) {
                buffMaxPowerCars.clear();
                buffMaxPowerCars.add(car);
                continue;
            }

            //3
            if (car.getPower() == buffMaxPowerCars.get(0).getPower()) {
                buffMaxPowerCars.add(car);
            }
        }
        return buffMaxPowerCars;
    }

    public static Car findSlowlyCar(Collection<Car> cars) {
        if (cars == null || cars.isEmpty()) {
            return null;
        }
        Car buffMinPowerCar = null;
        for (Car car : cars) {
            if (buffMinPowerCar == null || car.getPower() < buffMinPowerCar.getPower()) {
                buffMinPowerCar = car;
            }
        }
        return buffMinPowerCar;
    }

    public static List<Car> findCarsByMake(Collection<Car> cars, CarMake carMake) {
        if (cars == null || cars.isEmpty() || carMake == null) {
            return new ArrayList<>();
        }
        List<Car> carsByMake = new ArrayList<>();
        for (Car car : cars) {
            if (carMake == car.getCarMake()) {
                carsByMake.add(car);
            }
        }
        return carsByMake;
    }
}

