package lesson_09;

public class MyArrayDataException extends Throwable {
    public MyArrayDataException(int i, int j) {
        super(String.format(" Элемент в ячейке [%d][%d] невозможно привести к int", i, j));
    }
}
