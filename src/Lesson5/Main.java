package Lesson5;

record Employee(String fullName, String position, String email, long telephone,
                int salary, int age) {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Иванов Иван Иванович", "директор", "ivanovii@mail.ru", 1234567890, 100000, 65);
        emp[1] = new Employee("Петров Петр Петрович", "Бухгалтер", "petrovpp@mail.ru", 1234567890, 50000, 50);
        emp[2] = new Employee("Сидоров Сидор Сидорович", "Менеджер", "sidorovss@mail.ru", 1234567890, 30000, 30);
        emp[3] = new Employee("Михалков Никита Сергеевич", "Уборщик", "mihalkovns@mail.ru", 1234567890, 5000, 39);
        emp[4] = new Employee("Баюн Кот Котофеевич", "Сказочник", "bayunkk@mail.ru", 1234567890, 999999, 200);

        for (Employee employee : emp) {
            if (employee.age > 40) {
                employee.print();

            }
        }
    }

    public void print() {
        System.out.println("Фамилия Имя Отчество: " + fullName + ", Должность: " + position
                + ", Адрес e-mail: " + email + ", Номер телефона: " + telephone + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", telephone=" + telephone +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
