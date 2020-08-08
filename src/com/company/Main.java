package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        generaterandom();
        ageOfPerson(21,4);
        generaterandom();
        generaterandom();
        generaterandom();
        generaterandom();

        ageOfPerson(80, 90);
        ageOfPerson(70, 100);


    }

    public static String ageOfPerson(int temperature, int ageOfPerson) {

        if (ageOfPerson > 20 && ageOfPerson < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";


        } else if (ageOfPerson < 20 && temperature < 0 && temperature < 28) {
            return "Можно идти гулять";


        } else if (ageOfPerson > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";

        } else {

            return "оставайтесь дома";
        }


    }


    public static void generaterandom() {

    }

    Random random = new Random();

    int rand = random.nextInt(60) + 3;
    System.out.println("Можно ли идти гулять");


}







