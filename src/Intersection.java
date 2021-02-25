import java.util.ArrayList;

public class Intersection {
    private ArrayList<TrafficLight> trafficLights;
    int id;

    public Intersection(ArrayList<TrafficLight> trafficLights, int id) {
        this.trafficLights = trafficLights;
        this.id = id;
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
