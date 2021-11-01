package lesson_05;

public class MassiveUtils {
    /**
     * Формула создания метода
     * 1 - модификатор доступа - это одно из 4-х видов слов
     * public - метод/класс будет доступен внутри всего проекта (99% случаев используется)
     * ______ - будет доступен внутри пакета (текущей папки)
     * protected - внутри пакета и его наследникам
     * private - только внутри текущего класса (файла)
     * 2 - static (можно сделать, что его нужно писать, а можно нет) методы не у переменной, когда у переменной тогда не статик
     * 3 - Возвращаемый тип или слово void если ни чего не возвращает метод
     * 4 - Название метода (максимально понятно)
     * 5 - Входящие параметры в круглых скобках один или много через запятую с указанием типа
     * 6 - тело метода (то что должно происходить, когда метод вызовут
     */
    //сигнатура метода
    public static void printMassiveToConsole(int[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int countGlassFromMassive(int[][] mass) {
        int count = 0;
        for(int i=0;i<mass.length;i++){
            for (int j=0;j<mass[i].length;j++){
                if(mass[i][j]%2==0){
                    count++;
                }
            }
        }
        return count;
    }

}
