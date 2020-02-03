package abstraction;

import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        // Declare an arraylist of type Vehicle - This means all sub-classes can have objects in the list
        ArrayList<Vehicle> onTheRoad = new ArrayList<>();

        // Add some items
        onTheRoad.add(new Car(4, 5, 60, 4));
        onTheRoad.add(new Lorry(6, 2,55,4, 850));
        onTheRoad.add(new Bicycle(2, 1, 20, 0.0));

        // For all the items in the list
        for(Vehicle v : onTheRoad) {
            // If it is an instance of a given class
            if(v instanceof  MotorisedVehicle) {
                // Output a message
                System.out.println(v.getClass() + " is instance");
            }
        }

        /*
        Experiment with abstraction by changing which class to look for then have a go finding your own cases of abstraction and inheritance and implementing them in Java
         */
    }
}
