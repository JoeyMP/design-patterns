package Decorador;

public abstract class DecoratorCar implements Car {

    private Car car;

    public DecoratorCar(Car car) {
        this.car = car;
    }

    protected Car getCar(){
        return this.car;
    }
}
