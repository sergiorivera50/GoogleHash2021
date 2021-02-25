public class TrafficLight {
    private Intersection intersection;
    private TrafficState state = TrafficState.RED;
    private Street street;

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

    public String toString() {
        return state.name();
    }
}
