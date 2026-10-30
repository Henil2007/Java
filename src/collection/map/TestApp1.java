package collection.map;

import java.util.HashMap;
import java.util.Map;

public class TestApp1 {

    public static void main(String[] args) {
        HashMap<Integer,String> mapObj = new HashMap<Integer, String>();

        // HashMap do not maintain insertion order
        // Data -- Key , value --> Map [HashMap , LinkedHashMap , TreeMap]

        mapObj.put(101,"Henil");
        mapObj.put(100,"Rohit");
        mapObj.put(12,"Mohit");
        mapObj.put(1,"Suresh");
        mapObj.put(123,"Ramesh");

        for (Map.Entry<Integer,String> e : mapObj.entrySet()) {
            int key = e.getKey();
            String value = e.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
