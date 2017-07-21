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

        Arrays.sort(arrayShips, new Comparator<AbstractShip>() {
            public int compare(AbstractShip o1, AbstractShip o2) {
                Float a1 =  o1.calculatePayment();
                Float a2 =  o2.calculatePayment();

                return a2.compareTo(a1);
            }
        });


        for (AbstractShip ship: arrayShips) {
            result += ship.getName() + "=" + ship.calculatePayment();
        }

        return result;


    }

    public AbstractShip[] getArrayShip() {
        return arrayShip;
    }
}
