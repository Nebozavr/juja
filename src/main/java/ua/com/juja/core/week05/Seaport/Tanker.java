package ua.com.juja.core.week05.Seaport;

public class Tanker extends AbstractShip {

    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rental) {
        if (rental < 1){
            return calculatePayment();
        }
        return volume * rental;
    }
}
