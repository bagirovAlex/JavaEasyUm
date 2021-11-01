package Lesson_11;

public class Main1 {
    public static void main(String[] args) {
        University university = new University();

        Group group1 = new Group("ФизМат");
        Group group2 = new Group("ФизКульт");


        Student ivan = new Student("Иван", 32, true);
        Student ira = new Student("Ира", 16, true);

        Student ignat = new Student("Игнат", 23, true);
        Student igor = new Student("Игор", 32, true);
        Student oleg = new Student("Олег", 18, true);

        university.addStudent(ira, "ФизМат");
        university.addStudent(ivan, "ФизМат");
        university.addStudent(ignat, "физКульт");
        university.addStudent(igor, "История");
        university.addStudent(oleg, "История");
    }




}
