package abstraction;

/*
MotorisedVehicle inherits from Vehicle, so it will have access to all the fields in Vehicle
 */
public abstract class MotorisedVehicle extends Vehicle {

    // Motor vehicles have headlights, so this variable counts that
    protected  int numHeadlights;

    /*
    The constructor calls the parent constructor using "super" and passes the required values
     */
    MotorisedVehicle(int numWheels, int numSeats, int topSpeed, int numHeadlights) {
        // Call the parent constructor first
        super(numWheels, numSeats, topSpeed);
        // Set the headlights
        this.numHeadlights = numHeadlights;
    }
}
