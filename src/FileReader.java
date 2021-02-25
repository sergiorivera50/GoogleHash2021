import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static ArrayList<int[]> readFileAsIntArray(String fileName) {
        File inputFile = new File ("");
        Scanner in = null;
        try {
            in = new Scanner (inputFile);
        } catch (FileNotFoundException e) {
            System.out.println ("Cannot open " + fileName);
            System.exit (0);
        }
        ArrayList<int[]> result = new ArrayList<>();

        while(in.hasNextLine()) {
            String textToAdd = in.nextLine();
            String[] strArray = textToAdd.split(" ");
            int[] intArray = new int[strArray.length];
            for(int i = 0; i < strArray.length; i++) {
                intArray[i] = Integer.parseInt(strArray[i]);
            }
            result.add(intArray);
        }

        in.close ();
        return result;

    }
}
