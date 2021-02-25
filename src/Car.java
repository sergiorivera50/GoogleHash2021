import java.util.ArrayList;

public class Car {
    private ArrayList<Street> roads;
    private int numRoads;
    private Street currentStreet;
    private int timeToIntersection;

    public Car(int numRoads, ArrayList<Street> streetList) {
        this.numRoads = numRoads;
        this.roads = streetList;
        this.currentStreet = this.roads.get(0);
        this.timeToIntersection = 0;
    }



    public ArrayList<Street> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Street> roads) {
        this.roads = roads;
    }
}
