package lesson_05;

public class Employee {
    private String name;
    private String post;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name) {
        this(name, "dfsfs", "dsfsd", "235632532", 1242, 22);
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Сотрудник: %s, возрастом %d, занимающий должность - %s, почта %s и телефоном %s, имеет зарплату: %d руб", name, age, post, email, phone, salary);
    }

    public int getAge() {
        return age;
    }
}
