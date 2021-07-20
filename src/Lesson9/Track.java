package Lesson9;

public record Track(int Length) implements Competition {

    @Override
    public boolean result(Party party) {
        if (party.run(this.Length)) {
            System.out.printf("%s пробежал %d метров.\n", party.getClass().getSimpleName(), Length);
            return true;
        }
        System.out.printf("%s не смог пробежать %d метров.\n", party.getClass().getSimpleName(), Length);
        return false;
    }
}
