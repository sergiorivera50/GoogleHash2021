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

    public Street getStreetTo(Intersection nextIntersection) throws Exception {
        /* Search through all the streets connected to this intersection */
        for (Street street : streets) {
            /* If the current street leads to the given intersection, return */
            if (street.getEndIntersection() == nextIntersection) {
                return street;
            }
        }

        /* There are no streets that lead to the given intersection */
        throw new Exception("Car can't go anywhere!");
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
