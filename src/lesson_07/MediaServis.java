package lesson_07;

public class MediaServis {
    public static void printOldestMedia(MediaProduct[] media){
        MediaProduct oldest = media[0];
        for (MediaProduct product:media){
            if(product.getYear() < oldest.getYear()){
                oldest=product;
            }
        }
        oldest.printAllInfo();
    }
}
