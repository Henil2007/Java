package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TestApp3 {

    public static void main(String[] args) {

        TreeMap<Integer,String> mapObj = new TreeMap<Integer, String>();

        // TreeMap arranges the inserted data into ascending order of their keys.

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
