import java.util.ArrayList;

public class Parser {
    ArrayList<String[]> rawInput;
    int time;
    int numIntersections;
    int numStreets;
    int numCars;
    int points;
    ArrayList<Street> streets;
    ArrayList<Car> cars;


    Parser(String fileName) {
        this.rawInput = FileReader.readFileAsIntArray(fileName);
        String[] info = rawInput.get(0);
        this.time = Integer.parseInt(info[0]);
        this.numIntersections = Integer.parseInt(info[1]);
        this.numStreets = Integer.parseInt(info[2]);
        this.numCars = Integer.parseInt(info[3]);
        this.points = Integer.parseInt(info[4]);

        this.registerStreets();


    }

    private void registerStreets() {
        this.streets = new ArrayList<>();
        for (int i = 1; i < numStreets + 1; i++) {
            String[] streetText = rawInput.get(i);
            int start = Integer.parseInt(streetText[0]);
            int end = Integer.parseInt(streetText[4]);
            String name = streetText[2];
            int length = Integer.parseInt(streetText[3]);
            this.streets.add(new Street(start, end, name, length));
        }
    }

    private void registerCars() {
        this.cars = new ArrayList<>();
        for (int i = 1 + numStreets; i < numStreets + numCars + 1; i++) {
            String[] carText = rawInput.get(i);
            ArrayList<Street> temp = new ArrayList<>();
            int numRoads = Integer.parseInt(carText[0]);
            for (int j = 1; j < carText.length; j++) {
                for (Street x : this.streets) {
                    if(x.getName().equals(carText[j])) {
                        temp.add(x);
                    }
                }
            }
            this.cars.add(new Car(numRoads, temp));
        }

    }
}
