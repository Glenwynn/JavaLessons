package Lesson6;

public class Dog extends Animal {
    public Dog(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;

    }

    @Override
    public void toRun(int distance) {
        if (distance < 500) {
            System.out.println(name + " runs " + distance + "m" + ", "+colour +" colour" + ", " + age + " years old ");
        } else {
            System.out.println(name + "   is unable to run more than 500m");
        }
    }

    @Override
    public void toSwim(int length) {
        if (length < 10) {
            System.out.println(name + " swims " + length + "m" + ", "+colour +" colour" + ", "+ age + " years old ");
        } else {
            System.out.println(name + " is unable to swim more than 10 m");
        }
    }
}