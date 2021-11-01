package lesson_13;

public class Coin implements Comparable<Coin> {
    private int nominal;
    private double diametr;
    private String metall;
    private int yaer;


    //Конструкторы


    public Coin() {
    }

    public Coin(int nominal, double diametr, String metall, int yaer) {
        this.nominal = nominal;
        this.diametr = diametr;
        this.metall = metall;
        this.yaer = yaer;
    }

    public int getNominal() {
        return nominal;
    }

    ///гетеры и сетеры
    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    public String getMetall() {
        return metall;
    }

    public void setMetall(String metall) {
        this.metall = metall;
    }

    public int getYaer() {
        return yaer;
    }

    public void setYaer(int yaer) {
        this.yaer = yaer;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "nominal=" + nominal +
                ", diametr=" + diametr +
                ", metall='" + metall + '\'' +
                ", yaer=" + yaer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;

        Coin coin = (Coin) o;

        if (getNominal() != coin.getNominal()) return false;
        if (Double.compare(coin.getDiametr(), getDiametr()) != 0) return false;
        if (getYaer() != coin.getYaer()) return false;
        return getMetall() != null ? getMetall().equals(coin.getMetall()) : coin.getMetall() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getNominal();
        temp = Double.doubleToLongBits(getDiametr());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getMetall() != null ? getMetall().hashCode() : 0);
        result = 31 * result + getYaer();
        return result;
    }


    @Override
    public int compareTo(Coin o) {
        if (this.getYaer() != o.getYaer()) {
            return this.yaer - o.yaer;
        }
        if(this.nominal != o.nominal){
            return this.nominal- o.nominal;
        }
        if(this.diametr != o.diametr){
            return Double.compare(this.diametr, o.diametr);
        }
        return this.getMetall().compareTo(o.getMetall());
    }
}
