package lesson_07;

public class Film extends MediaProduct{

    private String studio;
    private String director;
    private int mins;

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getMins() {
        return mins;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Фильм: " + this.name + ", "+ this.mins+ ", "+this.director+ ", "+this.studio+ ", "+this.year);
    }
}
