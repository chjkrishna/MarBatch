package collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {

        List myList = new ArrayList();
        myList.add("Jay");
        myList.add("Navya");
        myList.add("Rahul");
        myList.add("Jay");
        myList.add("Raksha");
        System.out.println(myList);

        Set mySet = new HashSet();
        mySet.add("Jay");
        mySet.add("Rahul");
        mySet.add("Jay");
        mySet.add("Raksha");
        mySet.add("Navya");

        System.out.println(mySet);

        Map myMap = new HashMap();
        myMap.put("101","Jaya");
        myMap.put("102", "Navya");
        myMap.put("103", "Rahul");
        System.out.println(myMap);
        System.out.println(myMap.get("102"));

    }
}
