package lesson_10.task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<E extends Fruit> {

    private List<Fruit> listFruit = new ArrayList<>();

    public Box() {
    }

    public Box(E[] array) {
        Collections.addAll(listFruit, array);
    }

    public float getWeight() {
        if (listFruit.isEmpty()) {
            return 0;
        } else {
            return listFruit.size() * listFruit.get(0).getWeight();
        }
    }

    public boolean compare(Box<?> box) {
        return Math.abs(box.getWeight() - this.getWeight()) < 0.00001;
    }

    public void addFruit(Box<E> fruitBox) {
        try {
            listFruit.addAll(fruitBox.listFruit);
            fruitBox.listFruit.clear();
        } catch (Exception e) {
            System.out.println("нельзя пересыпать из этого же ящика");
        }
    }

    public void addOneFruit(E fruit) {
        listFruit.add(fruit);
    }

}