package Lesson6;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Polkan","black", 10);
        dog.toRun(150);
        dog.toSwim(5);

        Cat cat = new Cat("Murzik","red", 6);
        cat.toRun(150);
        cat.toSwim(250);


    }
}
