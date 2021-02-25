import java.util.ArrayList;

public class Car {
    private ArrayList<Street> roads;
    private int numRoads;
    private String currentStreet;

    public Car(int numRoads, ArrayList<Street> streetList) {
        this.numRoads = numRoads;


    }



    public ArrayList<Street> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Street> roads) {
        this.roads = roads;
    }
}
