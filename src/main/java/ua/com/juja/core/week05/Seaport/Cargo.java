package ua.com.juja.core.week05.Seaport;

public class Cargo extends AbstractShip {

    private float tonnage;
    public static final float DEFAULT_RENTAL = 550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }
    public float calculatePayment(float rental) {
        if (rental < 1){
            return  calculatePayment();
        }

        return tonnage * rental;
    }
}
