import java.io.*;
import java.util.ArrayList;

public class Writer {
    public Writer(ArrayList<Intersection> intersections) {
        try {
            File outputFile = new File("out.txt");
            if (outputFile.createNewFile()) {
                FileOutputStream outStream = new FileOutputStream(outputFile);
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outStream));

                writer.write(String.valueOf(intersections.size()));
                writer.newLine();
                for (Intersection intersection : intersections) {
                    writer.write(String.valueOf(intersection.getId()));
                    writer.newLine();
                    ArrayList<Street> incomingStreets = intersection.getIncomingStreets();
                    writer.write(String.valueOf(incomingStreets.size()));
                    writer.newLine();
                    for (Street street : incomingStreets) {
                        writer.write(street.getName() + " 1");
                        writer.newLine();
                    }
                }
                writer.close();
                outStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
