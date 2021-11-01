package lesson_09_2group;

public class Main {
    public static void main(String[] args) {
        //Vehicle v = new Vehicle(19.5, 60);
        Bus bus = new Bus(50, 15, 100, 5);

// get
        System.out.println( bus.getPetrolAmount() );
        System.out.println( bus.getTankVolume() );
        System.out.println();

// init
        Base.vehicles_on_base = 49;
        Base.people_on_base = 99;
        Base.petrol_on_base = 1000.0;
        Base.goods_on_base  = 2000.0;

        System.out.println("Initially:");
        System.out.println( Base.vehicles_on_base );
        System.out.println( Base.people_on_base );
        System.out.println( Base.petrol_on_base );
        System.out.println( Base.goods_on_base );
        System.out.println();

// arrive
        bus.arrive();
        System.out.println( "Arrived:" );

        System.out.println( Base.vehicles_on_base );	// arrived
        System.out.println( Base.people_on_base );

        System.out.println( Base.petrol_on_base );	// same
        System.out.println( Base.goods_on_base );
        System.out.println();

// leave
        bus.leave();
        System.out.println( "Left:" );

        System.out.println( Base.vehicles_on_base );	// left
        System.out.println( Base.people_on_base );

// should be 1000-(60-19.5)
        System.out.println( Base.petrol_on_base );	// changed!

        System.out.println( Base.goods_on_base );	// same
        System.out.println();
    }
}
