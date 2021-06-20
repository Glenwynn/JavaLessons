public class Lesson2 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        }


    public static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Apple");
        System.out.println("Banana");
    }

    public static void checkSumSign() {
        int a = (int) (Math.random() * (200 + 1)) - 100;
        int b = (int) (Math.random() * (200 + 1)) - 100;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = (int) (Math.random() * (200 + 1)) - 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (0 < value && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

}
