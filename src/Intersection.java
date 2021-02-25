import java.util.ArrayList;

public class Intersection {
    private ArrayList<TrafficLight> trafficLights;
    private ArrayList<Street> inStreets;
    private Street activeStreet;
    int id;

    public Intersection(ArrayList<Street> incoming, int id) {
        this.id = id;

        /* Get traffic lights and their streets */
        //this.trafficLights = trafficLights;
        inStreets = incoming;
    }

    /**public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }**/

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
