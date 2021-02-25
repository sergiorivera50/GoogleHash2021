public class TrafficLight {
    private TrafficState state = TrafficState.RED;
    private Street street;

    public TrafficLight(Street street) {
        this.street = street;
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
}
