import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class testingInput {
    public static void main(String[] args) {
        /**
        Parser test = new Parser("b.txt");
        for (Intersection x : test.intersections) {
            System.out.println(x);
        }
         **/



        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("1.txt", true));
            //writer.append(str.toString());
            Parser test = new Parser("b.txt");
            String output;


            writer.append(Integer.toString(test.numIntersections));
            writer.append("\n");
            for (Intersection x : test.intersections) {
                StringBuilder str = new StringBuilder();
                str.append(x.getId());
                str.append("\n");
                str.append(x.getInStreets().size());
                str.append("\n");
                for (Street i : x.getInStreets()) {
                    str.append(i.getName() + " 1");
                    str.append("\n");
                }
                writer.append(str.toString());
                System.out.println(x.getId());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
