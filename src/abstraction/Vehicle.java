package abstraction;

public abstract class Vehicle {

    // numWheels is for the number of wheels the vehicle has
    private int numWheels;

    // numSeats is for the number of seats the vehicle has
    private int numSeats;

    // topSpeed is for the top speed of the vehicle
    private int topSpeed;

    /*
    Constructor sets up the object using the passed values
     */
    Vehicle(int numWheels, int numSeats, int topSpeed) {
        this.numWheels = numWheels;
        this.numSeats = numSeats;
        this.topSpeed = topSpeed;
    }

}
