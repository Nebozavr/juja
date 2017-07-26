package ua.com.juja.example.interfaceExmpl;

public class Bird extends Animal {
    public Bird(int weigth, int age) {
        this.weigth = weigth;
        this.age = age;
    }

    public String move() {
        return "flap-flap";
    }

    public String Roar() {
        return "kar-kar";
    }

    boolean isNewBorn() {
        return (age > 1) ? false : true;
    }
}
