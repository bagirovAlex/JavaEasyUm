package lesson_09_2group;

public class Truck extends Vehicle {
    private int goods; //
    private int currentLoad; // получить текущую загруженность машины (масса груза в тоннах);
    private int maxLoad; // узнать максимальную вместительность (грузоподъемность) машины;

    public Truck() {
    }

    public Truck(double tankVolume, double petrolAmount) {
        super(tankVolume, petrolAmount);
    }


    public int getGoods() {
        return goods;
    }

    public void setGoods(int goods) {
        this.goods = goods;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        maxLoad = maxLoad;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.goods_on_base += currentLoad;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.petrol_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());

        if (Base.goods_on_base >= (maxLoad - currentLoad)) {
            Base.people_on_base -= (maxLoad - currentLoad);
            currentLoad = maxLoad;
        }else{
            currentLoad += Base.goods_on_base;
            Base.goods_on_base = 0;
        }
        return true;
    }
}
