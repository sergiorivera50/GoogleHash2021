import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

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

        Parser test = new Parser("a.txt");
        String output;
        StringBuilder str = new StringBuilder();

        str.append(test.numIntersections);
        str.append("\n");
        for (Intersection x : test.intersections) {
            str.append(x.getId());
            str.append("\n");
            str.append(x.getInStreets().size());
            str.append("\n");
            for (Street i : x.getInStreets()) {
                str.append(i.getName() + " 1");
                str.append("\n");
            }
        }
        System.out.println(str.toString());

    }
}
