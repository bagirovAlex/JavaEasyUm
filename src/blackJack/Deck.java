package blackJack;

import java.util.concurrent.ThreadLocalRandom;

public class Deck implements IDeck{

    ICard[] deckCard = new ICard[52]; //колода карт

    public Deck() {
        deckCard[0] = new Card("Двойка Трефа", 2);
        deckCard[1] = new Card("Двойка Черви", 2);
        deckCard[2] = new Card("Двойка Бубны", 2);
        deckCard[3] = new Card("Двойка Пики", 2);

        deckCard[4] = new Card("Тройка Трефа", 3);
        deckCard[5] = new Card("Тройка Черви", 3);
        deckCard[6] = new Card("Тройка Бубны", 3);
        deckCard[7] = new Card("Тройка Пики", 3);

        deckCard[8] = new Card("Четверка Трефа", 4);
        deckCard[9] = new Card("Четверка Черви", 4);
        deckCard[10] = new Card("Четверка Бубны", 4);
        deckCard[11] = new Card("Четверка Пики", 4);

        deckCard[12] = new Card("Петерка Трефа", 5);
        deckCard[13] = new Card("Петерка Черви", 5);
        deckCard[14] = new Card("Петерка Бубны", 5);
        deckCard[15] = new Card("Петерка Пики", 5);

        deckCard[16] = new Card("Шестерка Трефа", 6);
        deckCard[17] = new Card("Шестерка Черви", 6);
        deckCard[18] = new Card("Шестерка Бубны", 6);
        deckCard[19] = new Card("Шестерка Пики", 6);

        deckCard[20] = new Card("Семерка Трефа", 7);
        deckCard[21] = new Card("Семерка Черви", 7);
        deckCard[22] = new Card("Семерка Бубны", 7);
        deckCard[23] = new Card("Семерка Пики", 7);

        deckCard[24] = new Card("Восьмерка Трефа", 8);
        deckCard[25] = new Card("Восьмерка Черви", 8);
        deckCard[26] = new Card("Восьмерка Бубны", 8);
        deckCard[27] = new Card("Восьмерка Пики", 8);

        deckCard[28] = new Card("Девятка Трефа", 9);
        deckCard[29] = new Card("Девятка Черви", 9);
        deckCard[30] = new Card("Девятка Бубны", 9);
        deckCard[31] = new Card("Девятка Пики", 9);

        deckCard[32] = new Card("Десятка Трефа", 10);
        deckCard[33] = new Card("Десятка Черви", 10);
        deckCard[34] = new Card("Десятка Бубны", 10);
        deckCard[35] = new Card("Десятка Пики", 10);

        deckCard[36] = new Card("Валет Трефа", 2);
        deckCard[37] = new Card("Валет Черви", 2);
        deckCard[38] = new Card("Валет Бубны", 2);
        deckCard[39] = new Card("Валет Пики", 2);

        deckCard[40] = new Card("Дама Трефа", 3);
        deckCard[41] = new Card("Дама Черви", 3);
        deckCard[42] = new Card("Дама Бубны", 3);
        deckCard[43] = new Card("Дама Пики", 3);

        deckCard[44] = new Card("Король Трефа", 4);
        deckCard[45] = new Card("Король Черви", 4);
        deckCard[46] = new Card("Король Бубны", 4);
        deckCard[47] = new Card("Король Пики", 4);

        deckCard[48] = new Card("Туз Трефа", 11);
        deckCard[49] = new Card("Туз Черви", 11);
        deckCard[50] = new Card("Туз Бубны", 11);
        deckCard[51] = new Card("Туз Пики", 11);

    }

    @Override
    public ICard randomCard() {
        int randomIndex = ThreadLocalRandom.current().nextInt(0,52);
        return deckCard[randomIndex];
    }
}
