package builder;

public class OneAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public OneAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    /**
     * 装配成需要的对象
     * @return
     */
    @Override
    public AirShip createAriShip() {
        Engine e = airShipBuilder.builderEngine();
        OribitalModule o = airShipBuilder.builderOrbitalModule();
        EscapeTower es = airShipBuilder.builderEscapeTower();

        AirShip airShip = new AirShip();
        airShip.setEngine(e);
        airShip.setEscaoeTower(es);
        airShip.setOrbitalModule(o);
        return null;
    }
}
