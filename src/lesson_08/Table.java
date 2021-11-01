package lesson_08;

public class Table {
    //Переменные
    private  int length;
    private  int wight;
    private  int height;
    private String material;
    private  String nameOfModel;

    //Конструкторы - это особый метод
    /*
    1 модификатор доступа
    2 возвращаемый тип + скобки + тело
     */

    public Table() { //пустой чтобы не было проблем с наследованием
    }

    public Table(int length, int wight, int height){
       // super();визуально не видная строчка
        super();
        this.length = length;
        this.wight = wight;
        this.height = height;
    }

    public Table(int length, int wight, int height, String material, String nameOfModel) {
        this.length = length;
        this.wight = wight;
        this.height = height;
        this.material = material;
        this.nameOfModel = nameOfModel;
    }

    //Методы

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWight() {
        return wight;
    }

    public void setWight(int wight) {
        this.wight = wight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }
}
