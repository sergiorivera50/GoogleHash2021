import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<String[]> readFileAsIntArray(String fileName) {
        File inputFile = new File (fileName);
        Scanner in = null;
        try {
            in = new Scanner (inputFile);
        } catch (FileNotFoundException e) {
            System.out.println ("Cannot open " + fileName);
            System.exit (0);
        }
        ArrayList<String[]> result = new ArrayList<>();

        while(in.hasNextLine()) {
            String textToAdd = in.nextLine();
            String[] strArray = textToAdd.split(" ");
            result.add(strArray);
        }

        in.close ();
        return result;

    }
}
