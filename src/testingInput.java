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
        Parser test = new Parser("b.txt");
        Writer writer = new Writer(test.intersections);
    }
}
