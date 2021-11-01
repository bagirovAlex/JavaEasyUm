package blackJack;

public interface IPlayer {

    void takeCard(ICard card);

    int countValuesOnHand(); //посчитать сумму карт

    boolean needMoreCard();

}
