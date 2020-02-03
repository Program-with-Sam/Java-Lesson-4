package abstraction;

/*
ManualVehicle inherits from Vehicle, but has different fields than the MotorisedVehicles
 */
public abstract class ManualVehicle extends Vehicle {

    // A dummy field for the example
    Object powerMethod;

    /*
    Constructor works as others
     */
    ManualVehicle(int numWheels, int numSeats, int topSpeed, Object powerMethod) {
        super(numWheels, numSeats, topSpeed);
        this.powerMethod = powerMethod;
    }
}
