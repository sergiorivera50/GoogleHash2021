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

    public Street getStreet() {
        return street;
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

    /* For the time it switches GREEN/RED every step */
    public void update() {
        this.switchLight();
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append(state.name());
        str.append("[");
        str.append(waitingCars.size());
        str.append("]");
        return state.name();
    }
}
