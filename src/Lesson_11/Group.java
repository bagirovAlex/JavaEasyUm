package Lesson_11;

public class Group {
    private  String name;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printToConsole(){
        System.out.println(name);
    }

}
