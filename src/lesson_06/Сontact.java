package lesson_06;

public class Сontact {
    //Характеристики данного типа (называют как: поля класса или переменные класса)
    private String name;
    private String email;
    private String phoneNumber;
    private String pathToImage;

    public void setEmail(String email) {
        this.email = email;
    }
    // явные входящие параметры и неявные
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }


    public void setName(String name){
        this.name = name;
    }


}
