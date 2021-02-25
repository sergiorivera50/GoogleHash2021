import java.util.ArrayList;

public class Intersection {
    private ArrayList<TrafficLight> trafficLights;
    private ArrayList<Street> streets;
    int id;

    public Intersection(ArrayList<TrafficLight> trafficLights, int id) {
        this.id = id;

        /* Get traffic lights and their streets */
        this.trafficLights = trafficLights;
        streets = new ArrayList<>();
        for (TrafficLight trafficLight : trafficLights) {
            Street currentStreet = trafficLight.getStreet();
            streets.add(currentStreet);
        }
    }

    public ArrayList<TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("I");
        str.append(id);
        str.append("{");
        for (TrafficLight trafficLight : trafficLights) {
            str.append(trafficLight);
        }
        str.append("}\n");
        return str.toString();
    }
}
