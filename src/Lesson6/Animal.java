package Lesson6;

public class Animal {
    String name;
    String colour;
    int age;


    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;

    }

    public Animal() {
    }

    public void toRun(int distance) {
        System.out.println(name + " runs " + distance + "m" + " , "+ colour +"  colour" + age + " years old ");
    }

    public void toSwim(int length) {
        System.out.println(name + " swims" + length + "m" + " , " + colour +"  colour" + age + " years old " );
    }
}