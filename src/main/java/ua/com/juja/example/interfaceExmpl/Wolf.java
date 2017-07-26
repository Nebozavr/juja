package ua.com.juja.example.interfaceExmpl;

public class Wolf extends Animal {
    public Wolf(int weigth, int age) {
        this.weigth = weigth;
        this.age = age;
    }

    public String move() {
        return "run-run";
    }

    public String Roar() {
        return "woof-woof";
    }

    boolean isNewBorn() {
        return (age > 2) ? false : true;
    }
}
