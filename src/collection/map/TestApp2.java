package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestApp2 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,String> mapObj = new LinkedHashMap<Integer, String>();

        // LinkedHashMap maintain the insertion order

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
