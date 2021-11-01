package Lesson_10_2group.sapoznik;

public class Main {
    public static void main(String[] args) {
        Tufli tufli1 = new Tufli();
        Tufli tufli2 = new Tufli();
        Tufli tufli3 = new Tufli();

        Sapogi sapogi1 = new Sapogi();
        Sapogi sapogi2 = new Sapogi();
        Sapogi sapogi3 = new Sapogi();

        Obuv[] obuvs = new Obuv[6];
        obuvs[0] = sapogi1;
        obuvs[1] = sapogi2;
        obuvs[2] = sapogi3;
        obuvs[3] = tufli1;
        obuvs[4] = tufli2;
        obuvs[5] = tufli3;

        for (Obuv o:obuvs){
            o.pochinit(); //полиморфизм
        }
    }

}
