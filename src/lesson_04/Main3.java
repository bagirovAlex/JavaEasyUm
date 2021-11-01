package lesson_04;

public class Main3 {
    public static void main(String[] args) {
        String source = "Алгоритмы+Данные=Программы";
      // нужно сделать так "Алгоритмы=Программы-Данные";
        // Определяем позицию символа '+‘
        int p1 = source.indexOf('+');// сохранится индекс 9
        // Определяем позицию символа '=‘
        int p2 = source.indexOf('=');
        // Вырезаем первое слово
        String alg = source.substring(0, p1); //вырежи от 0 до 9
        // Вырезаем второе слово
        String dat = source.substring(p1 + 1, p2); // вырезаем от следующего знака после + до =
        // Вырезаем третье слово
        String prg = source.substring(p2 + 1);// вырезаем от следующего знака после = до конца
        // Сшиваем все по-новому
        String target = alg + "=" + prg + "-" + dat;

        System.out.println(source);
        System.out.println(target);
    }
}
