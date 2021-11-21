package lesson_10.task_1;

public class Main {
    public static void main(String[] args) {
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.add("1");
        stringStorage.add("2");
        stringStorage.add("3");
        stringStorage.add("4");
        stringStorage.add("5");

        stringStorage.changeElement(0, 4);
        stringStorage.printList();

        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.add(1);
        intStorage.add(2);
        intStorage.add(3);
        intStorage.add(4);
        intStorage.add(5);

        intStorage.changeElement(2, 4);
        intStorage.printList();
    }
}
