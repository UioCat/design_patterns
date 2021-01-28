package builder;

public class Client {
    public static void main(String[] args) {
        AirShipDirector director = new OneAirShipDirector(new OneAirShipBuilder());
        AirShip airShip = director.createAriShip();
    }
}
