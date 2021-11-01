package Lesson_12;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public void initSides(int a, int b, int c) throws InCorrectSideException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InCorrectSideException("a <= 0 || b <= 0 || c <= 0");
        }
        if (b + c <= a) {
            throw new InCorrectSideException("Слишком большая сторона: a");
        }
        if (a + c <= b) {
            throw new InCorrectSideException("Слишком большая сторона: b");
        }
        if (b + a <= c) {
            throw new InCorrectSideException("Слишком большая сторона: c");
        }
        this.a = a;
        this.b = b;
        this.c = c;

    }

}
