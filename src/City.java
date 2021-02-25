import java.lang.reflect.Array;
import java.util.ArrayList;

public class City {
    private ArrayList<Intersection> intersections;
    private ArrayList<Car> cars;
    private int time = 0;

    public City(ArrayList<Intersection> intersections, ArrayList<Car> cars, int maxTime) {
        this.intersections = intersections;
        this.cars = cars;
        time = maxTime;
    }

    public void step() {
        /* Update intersection states */
        System.out.println("Updating intersection states...");
        for (Intersection intersection : intersections) {
            intersection.update();
        }

        /* Update car positions */
        System.out.println("Updating car positions...");
        for (Car car : cars) {
            if (car.reachedDestination()) {
                System.out.println("A car has reached its destination.");
                cars.remove(car);
            } else {
                car.step();
            }
        }
        time += 1;
    }
}
