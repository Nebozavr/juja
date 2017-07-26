package ua.com.juja.example.interfaceExmpl;

public abstract class Animal implements Moving, Roaring{

    protected int weigth;
    protected int age;

    public int getAge() {
        return age;
    }

    public int getWeigth() {

        return weigth;
    }

    abstract boolean isNewBorn();
}
