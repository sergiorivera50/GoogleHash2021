import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class testingInput {
    public static void main(String[] args) {

        Parser test = new Parser("a.txt");
        for (Intersection x : test.intersections) {
            System.out.println(x);
        }
    }
}
