package Lesson6;

public class Cat extends Animal {
    public Cat(String name,String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;

    }

    @Override
    public void toRun(int distance) {
        if (distance < 200) {
            System.out.println(name + " runs " + distance + "m" + ", "+ colour +"  colour" + ", " + age + " years old ");
        } else {
            System.out.println(name + "   unable to run more than 200m");
        }
    }

    @Override
    public void toSwim(int length) {
        System.out.println(name + " is unable to swim");
    }
}
