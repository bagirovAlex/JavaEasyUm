package lesson_05;

public class Main3 {
    public static void main(String[] args) {
        int[][] numbers1 = {{2,2,8},
                           {4,6,8},
                           {6,8,2}};
        int[][] numbers2 = {{15,23,55,45},
                           {44,65,86,76},
                           {65,35,75,54}};

        MassiveUtils.printMassiveToConsole(numbers1);
        MassiveUtils.printMassiveToConsole(numbers2);

        int count1 = MassiveUtils.countGlassFromMassive(numbers1);
        System.out.println(count1);
        System.out.println();

        int count2 = MassiveUtils.countGlassFromMassive(numbers2);
        System.out.println(count2);
        System.out.println();

    }
}
