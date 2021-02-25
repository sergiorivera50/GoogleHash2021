import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {
    private ArrayList<Intersection> intersections;
    private int time = 0;

    public City(ArrayList<Intersection> intersections, int maxTime) {
        this.intersections = intersections;
        time = maxTime;
    }

    public void step() {
        for (Intersection intersection : intersections) {
            ArrayList<TrafficLight> trafficLights = intersection.getTrafficLights();
            for (TrafficLight trafficLight : trafficLights) {
                update(trafficLight);
            }
        }
    }

    /* For the time, switches light every step (second) */
    private void update(TrafficLight trafficLight) {
        trafficLight.switchLight();
    }
}
