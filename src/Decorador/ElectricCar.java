package Decorador;

public class ElectricCar extends DecoratorCar {

    public ElectricCar(Car car) {
        super(car);
    }

    @Override
    public void start() {
        getCar().start();
        System.out.println("new feature start");
        //add feature
    }

    @Override
    public void stop() {
        getCar().stop();
        System.out.println("new feature stop");
        //add feature
    }
}
