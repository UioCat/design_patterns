package builder;

/**
 * 建造
 * @author uio
 */
public interface AirShipBuilder {
    Engine builderEngine();
    OribitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
