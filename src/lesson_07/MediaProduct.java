package lesson_07;

public abstract class MediaProduct {
    protected String name;
    protected int year;

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public abstract void printAllInfo();



}
