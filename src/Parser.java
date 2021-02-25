import java.util.ArrayList;

public class Parser {
    ArrayList<String[]> rawInput;
    int time;
    int numIntersections;
    int numStreets;
    int numCars;
    int points;
    ArrayList<Street> streets;
    Arraylist


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

    private Street[] registerStreets() {
        streets = new ArrayList<>();
        for (int i = 1; i < numStreets + 1; i++) {
            String[] streetText = rawInput.get(i);
            int start = Integer.parseInt(streetText[0]);
            int end = Integer.parseInt(streetText[4]);
            String name = streetText[2];
            int length = Integer.parseInt(streetText[3]);
            streets.add(new Street(start, end, name, length));
        }
    }

    private Intersection[]
}
