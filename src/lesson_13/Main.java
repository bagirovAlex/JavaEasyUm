package lesson_13;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Coin coin1 = new Coin(10, 2.3, "Золото", 1900);
        Coin coin2 =new Coin(10, 2.3, "Золото", 1900);
        Coin coin3 =new Coin(5, 2.3, "Серебро", 2005);
        Coin coin4 =new Coin(1, 2.4, "Бронза", 2005);
        Coin coin5 =new Coin(6, 5.3, "Медь", 1800);

        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(coin1);
        coins.add(coin2);
        coins.add(coin3);
        coins.add(coin4);
        coins.add(coin5);

        for(Coin c:coins){
            System.out.println(c);
        }


    }
}
