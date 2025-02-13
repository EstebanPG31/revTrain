import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayListandHashSet {

    public static void main(String[] args) {

        //Creating objects
        List<String> nameList = new ArrayList<>();
        HashMap<String, Integer>  thingsHashMap = new HashMap<>();
        
        //inserting 3 elements ineach object
        nameList.add("Juan Carlos");
        nameList.add("Galilea");
        nameList.add("Hector");

        thingsHashMap.put("Water bottle", 2);
        thingsHashMap.put("Mugs", 0);
        thingsHashMap.put("Chair", 5);

        //Iterating and printing all elements in our collections
        System.out.println("Elements in our List:");
        for (int i = 0; i < nameList.size(); i++){
            System.out.println(nameList.get(i));
        }
        System.out.println("\nElements in the HashMap:");
        for (String thing : thingsHashMap.keySet()){
            System.out.println(thing + " existance: " + thingsHashMap.get(thing));
        }
   }    
}
