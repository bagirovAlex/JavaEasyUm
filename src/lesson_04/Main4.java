package lesson_04;

public class Main4 {
    public static void main(String[] args) {

        //положить все гласные в массив
        //сначала узнать сколько гласных для того, чтобы узнать длину массива
        String text = "Some text in English";
        int countGlass = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'y') {
                countGlass++;
            }
        }
        char[] glassnie = new char[countGlass];

        int currentIndex = 0;
        for (char ch : text.toCharArray()) {
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'y') {
                glassnie[currentIndex] = ch;
                currentIndex++;
            }
        }
        System.out.println();
    }
}
