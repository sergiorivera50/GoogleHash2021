import java.util.LinkedList;
import java.util.Queue;

public class TrafficLight {
    private Intersection intersection;
    private TrafficState state = TrafficState.RED;
    private Street street;
    private Queue<Car> waitingCars = new LinkedList<>();

    public TrafficLight(Street street, Intersection intersection) {
        this.street = street;
        this.intersection = intersection;
    }

    public TrafficState getState() {
        return state;
    }

    public void setState(TrafficState newState) {
        state = newState;
    }

    public void switchLight() {
        if (state == TrafficState.GREEN) {
            state = TrafficState.RED;
        } else {
            state = TrafficState.GREEN;
        }
    }

    public void carArrives(Car car) {
        waitingCars.add(car);
    }

    public Car carLeaves() {
        Car leavingCar = waitingCars.peek();
        waitingCars.remove();
        return leavingCar;
    }

    public String toString() {
        return state.name();
    }
}
