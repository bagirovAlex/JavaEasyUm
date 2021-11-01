package lesson_08.Saper;

import java.util.concurrent.ThreadLocalRandom;

public class SaperField {
    private int[][] map = new int[20][20];

    public void deployBombsByLevel(int level) {
        int countBombs = 0;
        if (level == 1) {
            countBombs = 40;
        } else if (level == 2) {
            countBombs = 25;
        } else {
            countBombs = 10;
        }
        //Рекурсия - делаем действие столько раз пока условие не выполнится
        for (int i = 0; i < countBombs; i++) {
            addRandomBombs();
        }
    }


    private void addRandomBombs() {
        int row = ThreadLocalRandom.current().nextInt(0, 19 + 1);
        int column = ThreadLocalRandom.current().nextInt(0, 19 + 1);
        if (map[row][column] != -1) {// не бомба
            map[row][column] = -1;
        } else {
            this.addRandomBombs();
        }
    }

    public void printGameMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == -1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }


}
