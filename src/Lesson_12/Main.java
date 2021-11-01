package Lesson_12;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        try {
            triangle.initSides(3,5,10);
        } catch (InCorrectSideException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Ок");
    }
}
