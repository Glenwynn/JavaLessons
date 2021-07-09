package Lesson7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int x) {
        food -= x;
    }

    public void increaseFood(int z) {
        food += z;
    }

    public void info() {
        System.out.println("Total amount: " + food);
    }
}
