package lesson_12_1;

public class Person {
    //1.Поля класса
    private int age;
    private String name;
    private String surname;
    private int dohod;

    //2. Конструкторы
    public Person(){

    }

    public Person(int age){
        this.age = age;
    }

    public Person(int age, String name, String surname, int dohod){
        this.age = age;
        this.name = name;
        this.surname = surname;
        this.dohod = dohod;
    }



    //3.Метода класса
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDohod(int dohod) {
        this.dohod = dohod;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getDohod() {
        return dohod;
    }



}
