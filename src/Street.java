public class Street {
    private Intersection startIntersection, endIntersection;
    private String name;
    private int length;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Street (Intersection startIntersection, Intersection endIntersection, String name, int length) {
        this.name = name;
        this.startIntersection = startIntersection;
        this.endIntersection = endIntersection;
    }

    public Intersection getStartIntersection() {
        return startIntersection;
    }

    public Intersection getEndIntersection() {
        return endIntersection;
    }
}
