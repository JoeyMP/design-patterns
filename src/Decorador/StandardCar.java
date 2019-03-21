package Decorador;

public class StandardCar implements Car {

    @Override
    public void start() {
        System.out.println("start standard car");
    }

    @Override
    public void stop() {
        System.out.println("stop standard car");
    }
}
