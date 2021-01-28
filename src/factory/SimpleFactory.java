package factory;

/**
 * @author uio
 * SimpleFactory
 * 两种简单工厂方法
 */
public class SimpleFactory {

    // Car1,Car2实现了Car
    // 比如有两个汽车类都实现了汽车接口
    // 不使用简单工厂模式
    Car car1 = new Car1();
    Car car2 = new Car2();

    // 使用简单工厂模式，不关心创建过程，需要谁就给工厂参数，让工厂去创建
    Car car3 = CarFactory.createCar("car1");
    Car car4 = CarFactory.createCar("car2");

    // 第二种简单工厂模式
    // 遵循开闭原则
    Car car5 = CarFactory2.createCar1();
    Car car6 = CarFactory2.createCar2();
}

interface Car {}

class Car1 implements Car{}

class Car2 implements Car{}

class CarFactory {
    public static Car createCar(String type) {
        Car c = null;
        if("car1".equals(type)) {
            c = new Car1();
        } else if("car2".equals(type)) {
            c = new Car2();
        }
        return c;
    }
}


class CarFactory2 {
    public static Car createCar1() {
        return new Car1();
    }
    public static Car createCar2() {
        return new Car2();
    }
}