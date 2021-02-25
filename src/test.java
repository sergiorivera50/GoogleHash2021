import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<Integer> readFileAsIntArray(String fileName) {
        File inputFile = new File (fileName);
        Scanner in = null;
        try {
            in = new Scanner (inputFile);
        } catch (FileNotFoundException e) {
            System.out.println ("Cannot open " + fileName);
            System.exit (0);
        }
        ArrayList<Integer> result = new ArrayList<>();

        while(in.hasNextInt()) {
            result.add(in.nextInt());
        }

        in.close ();
        return result;

    }
}
