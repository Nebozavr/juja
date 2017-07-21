package ua.com.juja.core.week05.Seaport;

public interface SeaPortQueue {
    public final static int LENGTH_QUEUE_SHIP = 3;

    public int addShipToEndQueue(AbstractShip ship);

    public int removeShipFromBeginQueue();

    public String printQueueShip();
}
