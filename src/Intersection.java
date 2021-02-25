import java.util.ArrayList;

public class Intersection {
    private ArrayList<TrafficLight> trafficLights;
    private ArrayList<Street> streets;
    private Street activeStreet;
    int id;

    public Intersection(ArrayList<Street> connectedStreets, int id) {
        this.id = id;

        /* Get traffic lights and their streets */
        //this.trafficLights = trafficLights;
        streets = connectedStreets;
    }

    /**public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }**/

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("I");
        str.append(id);
        str.append("{");
        str.append("}\n");
        return str.toString();
    }
}
