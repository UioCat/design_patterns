package builder;

/**
 * @author uio
 */
public class AirShip {

    private OribitalModule orbitalModule;
    private Engine engine;
    private EscapeTower escaoeTower;

    public OribitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OribitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscaoeTower() {
        return escaoeTower;
    }

    public void setEscaoeTower(EscapeTower escaoeTower) {
        this.escaoeTower = escaoeTower;
    }
}

class OribitalModule {
    private String name;

    public OribitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower {
    private String name;

    public EscapeTower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

