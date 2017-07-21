package ua.com.juja.core.week05.Seaport;



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
            if (index == arrayShip.length- 1 ){
                arrayShip[index] = null;
            } else {
            arrayShip[index] = arrayShip[index + 1];

            }
        }


        indexShipInPort--;

        return 1;
    }

    public String printQueueShip() {
        if (indexShipInPort < 0){
            return "QueueEmpty";
        }

        String result = "";


        for (int index = 0; index <= indexShipInPort ; index++) {
            result += "{" + arrayShip[index].toPrint() + "};";
        }
        return result;
    }
}
