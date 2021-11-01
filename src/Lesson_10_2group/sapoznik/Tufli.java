package Lesson_10_2group.sapoznik;

public class Tufli extends Obuv implements ObuvForFix{
    private String kindOfMaterial;


    @Override
    public void pochinit() {
        System.out.println("Чиниим туфли!");
    }

    @Override
    public String kindOfMaterial() {
        return null;
    }

    @Override
    public int condition() {
        return 0;
    }

    @Override
    public String sole() {
        return null;
    }
}
