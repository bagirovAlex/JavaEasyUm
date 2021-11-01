package lesson_07;

public class Disk extends MediaProduct{

    private String avtor;
    private int countOfTrack;

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public int getCountOfTrack() {
        return countOfTrack;
    }

    public void setCountOfTrack(int countOfTrack) {
        this.countOfTrack = countOfTrack;
    }

    @Override
    public void printAllInfo() {
        System.out.println("Диск: "+ this.avtor + ", "+this.countOfTrack+", "+this.name + ", "+this.year);
    }
}
