package lesson_04;

public class Bagirov_Home_04 {
    public static void main(String[] args) {
        // 1) Вывести на консоль только гласные, в обратном порядке
        System.out.println();
        System.out.println("1) Вывести на консоль только гласные, в обратном порядке");
        String text = "Текстовая строка, которая у меня есть";
        //Узнать сколько гласных есть в строке, чтобы узнать длину массива.
        //Инициализируем переменную int countGlass в качестве счетчика
        int countGlass = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'у' || ch == 'е' || ch == 'о' || ch == 'а' || ch == 'ы' || ch == 'я' || ch == 'и' || ch == 'e' || ch == 'ю' || ch == 'ё') {
                countGlass++;
            }
        }
        //Массив гласных на количество символов посчитанных в countGlass;
        char[] glassArray = new char[countGlass];
        //Инициализируем переменную int currentIndex в качестве счетчика
        int currentIndex = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'у' || ch == 'е' || ch == 'о' || ch == 'а' || ch == 'ы' || ch == 'я' || ch == 'и' || ch == 'e' || ch == 'ю' || ch == 'ё') {
                glassArray[currentIndex] = ch;
                currentIndex++;
            }
        }
        //Вывести значения в обратном порядке
        for (int i = glassArray.length - 1; i >= 0; i--) {
            System.out.print(glassArray[i] + "; ");
        }
        System.out.println();
        System.out.println();

        // 2) Вывести на консоль сумму согласных букв
        System.out.println("2) Вывести на консоль сумму согласных букв");
        System.out.println("Сумма согласных букв: " + currentIndex);
        System.out.println();

        // 3) Вывести на консоль через букву в каждом слове
        System.out.println("3) Вывести на консоль через букву в каждом слове");
        //Посчитать количество букв без пробелов
        int countLetters = 0;
        for (char ch : text.toCharArray()) {
            if (ch != ' ' && ch != ',') {
                countLetters++;
            }
        }
        //Создать новый массив для всех букв кроме пробелов и символов
        char[] lettersAll = new char[countLetters];
        //Заполнить массив значениями из строки без пробелов
        int currentIndex2 = 0;
        for (char ch : text.toCharArray()) {
            if (ch != ' ' && ch != ',') {
                lettersAll[currentIndex2] = ch;
                currentIndex2++;
            }
        }
        for (int i = 0; i < lettersAll.length - 1; i = i + 2) {
            System.out.print(lettersAll[i] + "; ");
        }
        System.out.println();
        System.out.println();

        //4) Вывести на консоль только те слова, которые меньше 5ти символов
        System.out.println("4) Вывести на консоль только те слова, которые меньше 5ти символов");
        //Создать массив, где каждый элемент сохраняет целое слово
        String[] words = text.split(" ");
        int a = 0;
        for (int i = 0; i < words.length - 1; i++) {
            String b = words[a];
            if (b.length() < 5) {
                System.out.print(b + "; ");
            }
            a++;
        }
        System.out.println();
        System.out.println();

        //5) Вывести на консоль каждую первую букву каждого слова
        System.out.println("5) Вывести на консоль каждую первую букву каждого слова");
        for (int i = 0; i < words.length - 1; i++){
            String s = words[i];
            System.out.print(s.charAt(0)+"; ");

        }
    }
}
