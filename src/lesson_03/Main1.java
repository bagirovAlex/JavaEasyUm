package lesson_03;

public class Main1 {
    public static void main(String[] args) {
        //Создание массива, когда не знаем что положить внутрь
        int[] numbers = new int[6]; //сразу указывается его длина, заполняются 0 (цел) или 0.0 (вещ), false (булево), null (ссылочные)
//        numbers[0] = 5;
//        numbers[1] = 10;
//        numbers[2] = 15;
//        numbers[3] = 20;
//        numbers[4] = 25;
//        numbers[5] = 30;
        int value = 5;
        for (int i = numbers.length-1; i >=0; i--) {
            numbers[i] = value;
            value = value + 5;
            System.out.print(numbers[i]+"; ");
        }
        System.out.println();

        //Конструкция for each
        for(int n:numbers){
            System.out.print(n+"; ");
        }

    }
}
