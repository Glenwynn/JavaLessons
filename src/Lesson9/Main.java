package Lesson9;

public class Main {
    public static void main(String[] args) {
        Party[] party = {
                new Human(10000, 4),
                new Robot(2000, 3),
                new Cat(3000, 5)
        };

        Competition[] test = new Competition[]{
                new Track(1500),
                new Wall(1),
                new Track(2500),
                new Wall(2),
                new Track(3500),
                new Wall(3)
        };

        for (Party p : party) {
            for (Competition r : test) {
                if (!r.result(p))
                    break;
            }
        }
    }
}