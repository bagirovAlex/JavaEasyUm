package lesson_09_2group;

public class Bus extends Vehicle {
    private int people; //пассажиры
    private int peopleCount; // получить текущее количество пассажиров (водитель в это число не входит);
    private int maxPeople; //получить количество пассажирских мест;


    public Bus(double tankVolume, double petrolAmount, int people, int peopleCount) {
        super(tankVolume, petrolAmount);
        this.people = people;
        this.peopleCount = peopleCount;
        this.maxPeople = maxPeople;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    @Override
    public void arrive() {
        Base.people_on_base++;
        Base.vehicles_on_base++;
        Base.people_on_base = Base.people_on_base + peopleCount; //Base.people_on_base + =  peopleCount;
    }

    @Override
    public boolean leave() {
        if (!canLeaveVehicle()) {
            return false;
        }
        Base.petrol_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - (getTankVolume() - getPetrolAmount());

        if (Base.people_on_base >= (maxPeople - peopleCount)) {
            Base.people_on_base -= (maxPeople - peopleCount);
            peopleCount = maxPeople;
        }else {
            peopleCount += Base.people_on_base;
            Base.people_on_base = 0;

        }
        return true;
    }
}
