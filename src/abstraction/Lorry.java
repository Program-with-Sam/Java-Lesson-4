package abstraction;
/*
Lorry also inherits from the MotorisedVehicle, but has an additional field, which is unnecessary for the Car class
 */
public class Lorry extends MotorisedVehicle {

    // maxWeight is the maximum weight of the lorry
    protected double maxWeight;

    /*
    Constructor functions as others
     */
    Lorry(int numWheels, int numSeats, int topSpeed, int numHeadlights, double maxWeight) {
        super(numWheels, numSeats, topSpeed, numHeadlights);
        this.maxWeight = maxWeight;
    }
}
