package blackJack;

public interface IGame {

    void giveTwoCards();

    void printWinner();

    void giveOtherCardsIfNeed();

    void addPlayer(IPlayer iPlayer);



}
