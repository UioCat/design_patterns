package builder;

/**
 * @author uio
 * 一个构建者
 */
public class OneAirShipBuilder implements AirShipBuilder{

    /**
     * 构建发动机等产品时，可以与工厂模式结合
     */
    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机");
        return new Engine("One构建的发动机");
    }

    @Override
    public OribitalModule builderOrbitalModule() {
        return new OribitalModule("One构建的轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("One构建的逃逸塔");
    }
}
