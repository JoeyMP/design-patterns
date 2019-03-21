package Decorador;

public class Test {

    public static void main(String[] args) {
        Car car = new StandardCar();
        car = new ElectricCar(car);
        car.start();
        car.stop();
    }
}
