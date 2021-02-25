public class Street {
    private int startIntersectionId, endIntersectionId;
    private String name;
    private int length;
    private TrafficLight test;

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
        this.test = new TrafficLight(this, 1232)
    }

    public int getStartIntersection() {
        return startIntersectionId;
    }

    public int getEndIntersection() {
        return endIntersectionId;
    }
}
