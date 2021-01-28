package factory;

/**
 * @author uio
 * 工厂方法模式
 * 为了避免简单不完全满足开闭原则
 * 工厂方法模式和简单工厂模式最大的不同在于，简单工厂模式只有一个工厂类，而工厂方法模式有一组实现了相同接口的工厂类
 */
public class FactoryMethod {

    Car car1 = new Car3();
    Car car2 = new Car4();
}

interface CarFactoryForFactoryMethod {
    Car createCar();
}


class Car3 implements CarFactoryForFactoryMethod, Car {
    @Override
    public Car createCar() {
        return new Car3();
    }
}

class Car4 implements CarFactoryForFactoryMethod, Car {
    @Override
    public Car createCar() {
        return new Car4();
    }
}



