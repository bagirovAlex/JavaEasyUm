package lesson_05;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Цикл в цикле на примере таймере
        for(int day = 0; day < 365; day++){           //Цикл считает сутки
            for(int hour=0;hour<24;hour++){           //Цикл считает часы внутри суток
                for (int min =0; min<60; min++){      //Цикл считает минут внутри часа
                    for(int sec=0;sec<60;sec++){      //Цикл считает секунды внутри минуты
                        //Отформатированный вывод: %d - это число; %s - это строка
                        String name = "Алексей";
                        System.out.printf(" %s, со старта прошло: %d дня, %d часов, %d минуты, %d секунд. \n", name, day, hour, min, sec);
                        //Заснуть на одну секунду
                        Thread.sleep(1000);
                    }
                }
            }
        }
    }
}
