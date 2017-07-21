package ua.com.juja.core.week05.Seaport;

public class SeaportTest {
    public static void main(String[] args) {
        AbstractShip liner = new Liner("Liner", 200, 100, 2000, 500);
        AbstractShip tanker = new Tanker("Tanker", 300, 150, 5000, 100);
        AbstractShip cargo = new Cargo("Cargo", 400, 200, 3500, 20);


        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();

        odessaSeaPort.addShipToEndQueue(liner);
        odessaSeaPort.addShipToEndQueue(tanker);
        odessaSeaPort.addShipToEndQueue(cargo);

        System.out.println(odessaSeaPort.printQueueShip());

        odessaSeaPort.removeShipFromBeginQueue();
        odessaSeaPort.addShipToEndQueue(tanker);
        odessaSeaPort.removeShipFromBeginQueue();
        System.out.println(odessaSeaPort.printQueueShip());


    }
}
