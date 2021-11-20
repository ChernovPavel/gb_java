package lesson_10.task_1;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<E> {
    private List<E> list = new ArrayList<>();

    public void add(E element) {
        list.add(element);
    }

    public void printList() {
        System.out.println(list);
    }

    public void changeElement(int i, int j) {
        if (i < list.size() && j < list.size()) {
            E item = list.get(j);
            list.set(j, list.get(i));
            list.set(i, item);
        } else {
            System.out.printf("Укажите индекс меньше, так как длина списка: %d%n", list.size());
        }
    }
}
