public class Lesson2 {
    static int a, b;

    public static void main(String[] args) {
        System.out.println("Задача 1");
        for (int i = 0; i < 3; i++) {
            calcAB();
            System.out.println("Value A:" + a + "Value B:" + b);
            System.out.println(sum(a, b));
        }
        System.out.println("Задача 2");
        calcAB();
        System.out.println(b);
        checkNumber(b);

        System.out.println("Задача 3");
        System.out.println(a);
        System.out.println(isNegativeOrPositive(a));

        System.out.println("Задача 4");
        printTextNTimes("Хорошо Живем", 5);

        System.out.println("Задача 5");
        System.out.println(isLeapYear(2020));
    }

    static void calcAB() {
        a = (int) (Math.random() * (200 + 1)) - 100;
        b = (int) (Math.random() * (200 + 1)) - 100;
    }

    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в
    // пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sum(int x, int y) {
        return x + y >= 10 && x + y <= 20;
    }

    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void checkNumber(int z) {
        if (z >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Число отрицательное");

    }

    //3. Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegativeOrPositive(int w) {
        return w < 0;
    }

    //    4. Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printTextNTimes(String text, int n) {
        for (;n > 0; n--) {
            System.out.println(text);
        }
    }
//    5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean
//    (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int y) {
        return (y %4 == 0 || y%400 == 0) && y%100 == 0;
    }

}







