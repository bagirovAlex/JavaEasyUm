package blackJack;

public class Card implements ICard {

    private int value;
    private String name;

    public Card(String name, int value){
    this.value = value;
    this.name = name;
    }

    public Card() {
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}
