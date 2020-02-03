package abstraction;

/*
Car inherits from the MotorisedVehicle class, but since that inherits from the Vehicle class it will have access to the same fields
 */
public class Car extends MotorisedVehicle {

    /*
    Constructor takes the arguments and calls the parent constructor
     */
    public Car(int numWheels, int numSeats, int topSpeed, int numHeadlights) {
        super(numWheels, numSeats, topSpeed, numHeadlights);
    }
}
