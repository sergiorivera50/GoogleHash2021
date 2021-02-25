import java.util.ArrayList;

public class Parser {
    ArrayList<String[]> rawInput;
    int time;
    int numIntersections;
    int numStreets;
    int numCars;
    int points;
    //Street[] streets;


    Parser(String fileName) {
        this.rawInput = FileReader.readFileAsIntArray(fileName);
        String[] info = rawInput.get(0);
        this.time = Integer.parseInt(info[0]);
        this.numIntersections = Integer.parseInt(info[1]);
        this.numStreets = Integer.parseInt(info[2]);
        this.numCars = Integer.parseInt(info[3]);
        this.points = Integer.parseInt(info[4]);

    }
}
