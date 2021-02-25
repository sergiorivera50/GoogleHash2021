import java.util.ArrayList;

public class Intersection {
    public ArrayList<Street> getInStreets() {
        return inStreets;
    }

    private ArrayList<Street> inStreets;
    private Street activeStreet;
    private int id;

    public Intersection(ArrayList<Street> incoming, int id) {
        this.id = id;

        /* Get traffic lights and their streets */
        //this.trafficLights = trafficLights;
        inStreets = incoming;
        activeStreet = incoming.get(0);
    }

    /**public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }**/

    public void update() {
        if (inStreets.size() != 1) {
            // change activeStreet according to f(x)
            activeStreet.dequeue();
        }
    }

    public Street getActiveStreet() {
        return activeStreet;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("I");
        str.append(id);
        str.append("{");
        for (Street street : inStreets) {
            String streetName = street.getName();
            str.append(streetName);
            str.append(", ");
        }
        str.append("}\n");
        return str.toString();
    }
}
