package Lesson9;

public record Robot(int MaxRun, int MaxJump) implements Party {

    @Override
    public boolean run(int length) {
        return this.MaxRun >= length;
    }

    @Override
    public boolean jump(int height) {
        return this.MaxJump >= height;
    }


}