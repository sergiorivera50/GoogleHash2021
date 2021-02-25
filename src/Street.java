import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Street {
    private int startIntersectionId, endIntersectionId;
    private String name;
    private int length;
    private Queue<Car> carQueue;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Street (int startIntersectionId, int endIntersectionId, String name, int length) {
        this.name = name;
        this.startIntersectionId = startIntersectionId;
        this.endIntersectionId = endIntersectionId;
        carQueue = new LinkedList();
    }

    public int getStartIntersection() {
        return startIntersectionId;
    }

    public int getEndIntersection() {
        return endIntersectionId;
    }

    public void enqueue(Car car) {
        this.carQueue.add(car);
    }
}
