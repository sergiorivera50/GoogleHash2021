import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {
    private ArrayList<Intersection> intersections;
    private int time = 0;

    public City(ArrayList<Intersection> intersections, int maxTime) {
        this.intersections = intersections;
        time = maxTime;
    }
}
