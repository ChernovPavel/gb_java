package lesson_05;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("Игорь Мухин", "уборщик", "123@ya.ru", "85555555645", 26453, 20);
        arr[1] = new Employee("Иван Петров", "директор", "director@ya.ru", "86666666993", 123123, 52);
        arr[2] = new Employee("Павел Щербин", "уборщик", "342@ya.ru", "85584555645", 52453, 65);
        arr[3] = new Employee("Илья Пронин", "бухгалтер", "6545@ya.ru", "83334445234", 76453, 23);
        arr[4] = new Employee("Денис Нестеров", "менеджер", "jdflkfjkdlkf@ya.ru", "8123432446", 55653, 43);

        for (Employee employee : arr) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}
