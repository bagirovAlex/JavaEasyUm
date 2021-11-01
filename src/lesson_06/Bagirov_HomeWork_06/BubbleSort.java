package lesson_06.Bagirov_HomeWork_06;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {43, 43, 65, 65, 4, 78, 9, 453, 76, 87, 6, 2, 43, 657, 67, 8, 9, 6, 6, 34, 4, 543, 345, 5, 1};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }

        Boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");
        }

    }

}
