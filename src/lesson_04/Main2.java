package lesson_04;

public class Main2 {
    public static void main(String[] args) {
        String text = "Какой-то текст.";
        //Заменить все гласные буквы на !
        text = text.replace('а','!');
        text = text.replace('о','!');
        text = text.replace('е','!');

        System.out.println(text);

        //trim() удаляет спереди и сзади пробелы
        //toLoweCase() делает все буквы маленькими
        //toUpperCase() делает все буквы маленькими
        //replaceAll - заменить слово или текст на указанное по всему тексту
        //replaceFirst - заменить слово или текст на указанное для первого совпадения

        //String - неизменяемый объект, то при изменении создаются ссылки занимая ОЗУ
        //StringBuffer - изменяемый объект
        //equals - сравнение ссылочных типов с учетом регистра
        //equalsIgnoreCase - сравнение ссылочных типов без учета регистра
        //regionMatches - сравнивает два участка строк
        //int compareTo - используется при сортировке, если this строка меньше, 0 если равны, 1 если больше



    }
}
