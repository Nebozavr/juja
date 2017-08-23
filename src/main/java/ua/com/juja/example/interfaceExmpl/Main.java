package ua.com.juja.example.interfaceExmpl;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Animal wolf = new Wolf(10,20);
        Animal bird = new Bird(2,1);

        System.out.println(wolf.move());
        System.out.println(bird.move());
        System.out.println(bird.move());



    }
}
