import java.util.ArrayList;

public class Car {
    private ArrayList<Street> roads;
    private int numRoads;
    private Street currentStreet;
    private int timeToIntersection;
    private boolean finished;

    public Car(int numRoads, ArrayList<Street> streetList) {
        this.numRoads = numRoads;
        this.roads = streetList;
        this.currentStreet = this.roads.get(0);
        this.roads.remove(0);
        this.timeToIntersection = 0;
    }



    public ArrayList<Street> getRoads() {
        return roads;
    }

    public void setRoads(ArrayList<Street> roads) {
        this.roads = roads;
    }

    public void nextRoad() {
        if (this.roads.size() == 0) {
            this.finished = true;
        } else {
            this.currentStreet = this.roads.get(0);
            this.roads.remove(0);
            this.timeToIntersection = this.currentStreet.getLength();
        }
    }

    public void step() {
        if (this.timeToIntersection == 0) {
            this.currentStreet.enqueue(this);
        } else {
            this.timeToIntersection -= 1;
        }

    }

    public boolean reachedDestination() {
        return this.finished;
    }
    public int getTimeToIntersection() {
        return this.timeToIntersection;
    }

}
