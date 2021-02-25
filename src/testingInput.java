import java.util.ArrayList;
import java.util.Arrays;

public class testingInput {
    public static void main(String[] args) {
        /**ArrayList<String[]> testArr = FileReader.readFileAsIntArray("a.txt");
        for (int i = 0; i < testArr.size(); i++) {
            System.out.println(Arrays.toString(testArr.get(i)));
        }
        **/

        Parser test = new Parser("a.txt");
        System.out.println(test.numCars);
    }
}
