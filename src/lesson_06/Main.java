package lesson_06;

public class Main {
    public static void main(String[] args) {
        /**
         *  ООП - 4 парадигмы
         *        1 Инкапсуляция - это скрытие данных лот других классов или структур кода, то есть реализация области видимости кода;
         *                         public - в рамках проекта
         *                         ______ - в рамках пакета
         *                         protected - в рамках пакета и наследниках
         *                         private - в рамках класса
         *                  Класс состоит:
         *                   - Переменные
         *                   - Конструкторы
         *                   - методы
         *                  Модификатор ставятся перед: классами, Переменными, Конструкторами, Методами;
         *        2
         *        3
         *        4
         *  Формула создание объекта
         *         Тип переменной
         *         Название переменной
         *         = new и указание типа который мы создаем
         */

        Сontact vasya = new Сontact();
        vasya.setName("vasya");
        vasya.setEmail("89168883138@mail.ru");
        vasya.setPhoneNumber("89168883138");

        Сontact petya = new Сontact();
        petya.setName("petya");
        petya.setEmail("mailpetya@mail.ru");
        petya.setPhoneNumber("89567773126");

        Сontact ira = new Сontact();
        ira.setName("ira");
        ira.setEmail("mailira@mail.ru");
        ira.setPhoneNumber("89567771111");

        Сontact ilya = new Сontact();
        ilya.setName("Ilya");
        ilya.setEmail("maililya@mail.ru");
        ilya.setPhoneNumber("89567772222");

        PhoneBook myBook = new PhoneBook();
        myBook.addContacts(vasya);
        myBook.addContacts(petya);
        myBook.addContacts(ira);
        myBook.addContacts(ilya);

        myBook.search("895");

    }

}
