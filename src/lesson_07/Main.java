package lesson_07;

public class Main {
    public static void main(String[] args) {
        Film film = new Film();
        film.setName("Зеленая миля");
        film.setDirector("Дарабонт");
        film.setMins(190);
        film.setYear(2000);

        Film film2 = new Film();
        film2.setName("Бесславные люди");
        film2.setDirector("Тарантино");
        film2.setMins(190);
        film2.setYear(2012);

        Disk disk= new Disk();
        disk.setName("Бла бла");
        disk.setAvtor("Киркоров");
        disk.setCountOfTrack(10);
        disk.setYear(1997);

        Disk disk2= new Disk();
        disk2.setName("Бла2 бла2");
        disk2.setAvtor("Шафутинский");
        disk2.setCountOfTrack(10);
        disk2.setYear(1985);

        MediaProduct[] media = new MediaProduct[4];
        media[0]=disk;
        media[1]=disk2;
        media[2]=film;
        media[3]=film2;

        for(MediaProduct product:media){
            product.printAllInfo(); //Полиморфизм -
        }

        MediaServis.printOldestMedia(media);

    }
}
