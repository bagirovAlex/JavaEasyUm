package lesson_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите e-mail: ");
        String email = scanner.nextLine();

        //Проверить наличие хотя бы одной "собаки" в email
        int indexOfDog = email.indexOf("@");   //метод indexOf возвращает -1 если не найдет String указанный в ()
        if(indexOfDog==-1){
            System.out.println("Email не содержит собак");
            return;
        }

        //Проверить количество собак в email, должно быть не более одного
        String[] partsByDog = email.split("@"); //метод split режет String по ("тексту") и считает части
        if(partsByDog.length !=2){
            System.out.println("Email содержит больше собак чем один");
            return;
        }
        //Одна точка обязана быть после собаки, но обе части не должны иметь точки вначале или в конце
        String partBeforeDog = partsByDog[0];
        String partsAfterDog = partsByDog[1];

        if(partBeforeDog.startsWith(".")||partBeforeDog.endsWith(".")){
            System.out.println("Email не подходит так как начинается или заканчивается с точки");
            return;
        }
        if(partsAfterDog.startsWith(".")||partsAfterDog.endsWith(".")){
            System.out.println("Email не подходит так как домен начинается или заканчивается с точки");
            return;
        }
        System.out.println("Е-mail прошел проверку");
    }
}
