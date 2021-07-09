package Lesson7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int action;
        Cat[] allCats = new Cat[5];
        allCats[0] = new Cat("Barsik", 10, false);
        allCats[1] = new Cat("Murzik", 20, false);
        allCats[2] = new Cat("Martyn", 50, false);
        allCats[3] = new Cat("Ryzhik", 45, false);
        allCats[4] = new Cat("Persik", 5, false);


        Plate plate = new Plate(70);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.fullness && allCat.appetite < plate.food) {
                allCat.eat(plate);
                allCat.fullness = true;
                System.out.println("Cat " + allCat.name + " it is full and happy!");
            } else {
                System.out.println("Cat " + allCat.name + " it is still hungry!");
            }
        }
        plate.info();
        System.out.println(" Please add food to the plate");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();

    }
}