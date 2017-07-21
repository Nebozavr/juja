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

        AbstractShip[] test = new AbstractShip[3];
        test[0] = liner;
        test[1] = tanker;
        test[2] = cargo;

        for (AbstractShip ship: odessaSeaPort.getArrayShip()) {
            System.out.println(ship.calculatePayment());
        }


        //System.out.println(sortSumPaymentAsc(odessaSeaPort.getArrayShip()));


    }
}
