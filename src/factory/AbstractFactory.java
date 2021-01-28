package factory;

/**
 * @author uio
 * 抽象工厂类
 * 用来生产不同产品族的全部产品（对于新增加的产品无能为力，支持新增产品族）
 */
public class AbstractFactory {
    
}

interface CarFactoryForAbstract {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}

class LuxuryCarFactory implements CarFactoryForAbstract {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}

class LowCarFactory implements CarFactoryForAbstract {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}

interface Engine {
    void run();
    void start();
}

class LuxuryEngine implements Engine{

    @Override
    public void run() {
        // doSomethings
    }

    @Override
    public void start() {
        // doSomethings
    }
}

class LowEngine implements Engine {

    @Override
    public void run() {
        // doSomethings
    }

    @Override
    public void start() {
        // doSomethings
    }
}

interface Seat {
    void message();
}

class LuxurySeat implements Seat {

    @Override
    public void message() {
        // doSomethings
    }
}

class LowSeat implements Seat {

    @Override
    public void message() {
        // doSomethings
    }
}

interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        // doSomethings
    }
}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        // doSomethings
    }
}