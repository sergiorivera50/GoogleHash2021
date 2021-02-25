import java.util.ArrayList;

public class Car {
    private ArrayList<String> roads;
    private int numRoads;
    private String currentStreet;

    public Car(int numRoads, ArrayList<String> routeList) {
        this.roads = routeList;
        this.numRoads = numRoads;
        this.currentStreet = this.roads.get(0);
    }

    public ArrayList<String> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<String> roads) {
        this.roads = roads;
    }
}
