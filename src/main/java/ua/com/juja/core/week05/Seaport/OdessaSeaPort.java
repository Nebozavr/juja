package ua.com.juja.core.week05.Seaport;


import java.util.Arrays;
import java.util.Comparator;

public class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];


    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort >= 2) {
            return -1;
        }

        indexShipInPort++;
        arrayShip[indexShipInPort] = ship;
        return indexShipInPort;
    }

    public int removeShipFromBeginQueue() {
        if (indexShipInPort < 0) {
            return -1;
        }

        for (int index = 0; index < arrayShip.length; index++) {
            if (index == arrayShip.length - 1) {
                arrayShip[index] = null;
            } else {
                arrayShip[index] = arrayShip[index + 1];
            }
        }

        indexShipInPort--;
        return 1;
    }

    public String printQueueShip() {
        if (indexShipInPort < 0) {
            return "QueueEmpty";
        }

        String result = "";

        for (int index = 0; index <= indexShipInPort; index++) {
            result += "{" + arrayShip[index].toPrint() + "};";
        }
        return result;
    }

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {

    String result = "";

    if (arrayShips == null || arrayShips.length < 0){
        return result;
    }

        for (int i = 0; i < arrayShips.length; i++) {
            for (int j = arrayShips.length - 1; j > i; j--) {
                if (arrayShips[j - 1].calculatePayment() > arrayShips[j].calculatePayment()) {
                    AbstractShip element = arrayShips[j - 1];
                    arrayShips[j - 1] = arrayShips[j];
                    arrayShips[j] = element;
                }
            }

        }

        for (AbstractShip ship: arrayShips) {
            result += ship.getName() + "=" + ship.calculatePayment();
        }

        return result;


    }

    public AbstractShip[] getArrayShip() {
        return arrayShip;
    }
}
