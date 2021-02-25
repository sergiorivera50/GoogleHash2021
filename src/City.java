import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {
    private ArrayList<Intersection> intersections;
    private ArrayList<TrafficLight> trafficLights;

    public City(ArrayList<Intersection> intersections) {
        this.intersections = intersections;
        for (Intersection intersection : intersections) {
            trafficLights = intersection.getTrafficLights();
        }
    }
}
