package lesson_09_2group;

public class Vehicle {
    //Базовый класс Vehicle ("транспортное средство"). Управляется одним водителем, ни груза, ни пассажиров не перевозит, потребляет некоторое количество топлива.
    private double tankVolume; // объем бензобака в литрах;
    private double petrolAmount; //текущее количество топлива в баке;

    public Vehicle() {
    }

    public Vehicle(double tankVolume, double petrolAmount) {
        this.tankVolume = tankVolume;
        this.petrolAmount = petrolAmount;
    }


    public double getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(double tankVolume) {
        this.tankVolume = tankVolume;
    }

    public double getPetrolAmount() {
        return petrolAmount;
    }

    public void setPetrolAmount(double petrolAmount) {
        this.petrolAmount = petrolAmount;
    }

    public void arrive() {
        Base.people_on_base++;
        Base.vehicles_on_base++;
    }

    public boolean leave() {
        if(!canLeaveVehicle()){
            return false;
        }

        return true;
    }
    protected boolean canLeaveVehicle(){
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }
        if (tankVolume - petrolAmount > Base.petrol_on_base) {
            return false;
        }
        Base.petrol_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base =Base.petrol_on_base - (tankVolume-petrolAmount);
        return true;
    }

}
