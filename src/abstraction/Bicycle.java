package abstraction;

/*
Bicycle then inherits from ManualVehicle
 */
public class Bicycle extends ManualVehicle {

    /*
    Constructor functions as others
     */
    Bicycle(int numWheels, int numSeats, int topSpeed, Object powerMethod) {
        super(numWheels, numSeats, topSpeed, powerMethod);
    }
}
