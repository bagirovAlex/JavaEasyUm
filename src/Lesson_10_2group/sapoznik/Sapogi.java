package Lesson_10_2group.sapoznik;

public class Sapogi extends Obuv implements ObuvForFix{
    public void pochinit(){
        System.out.println("Мы левачим на сапоги!");
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
