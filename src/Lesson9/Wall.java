package Lesson9;

public class Wall implements Competition {
    private final int Height;

    public Wall(int height) {
        this.Height = height;
    }

    public boolean result(Party party) {
        if (party.jump(this.Height)) {
            System.out.printf("%s прыгает на %d метров.\n", party.getClass().getSimpleName(), Height);
            return true;
        }
        System.out.printf("%s не может прыгнуть на %d метров.\n", party.getClass().getSimpleName(), Height);
        return false;
    }
}