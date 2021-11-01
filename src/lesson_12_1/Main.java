package lesson_12_1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setAge(23);
        person1.setDohod(210000);
        person1.setName("Вася");
        person1.setSurname("Пупкин");

        Person person2 = new Person(23, "Петя", "Шутов", 16000);

    }
}
