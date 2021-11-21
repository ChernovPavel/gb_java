package lesson_11;

public class TestPhonebook {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.get("Денис");
        phonebook.get("Павел");
        phonebook.add("Иван", "101");
        phonebook.get("Иван");
    }
}
