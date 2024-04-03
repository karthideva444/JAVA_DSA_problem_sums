/**
 * hashmapfunctions
 */
import java.util.HashMap;
import java.util.Map;

public class hashmapfunctions {

    public static void main(String[] args) {
        Map<String,Integer> myMap = new HashMap<>();
        Map<String,String> myMap2 = new HashMap<>();
        myMap.put("age",22 );
        myMap2.put("name", "karthick");
        myMap2.put("dept", "EEE");
        myMap.put("reg no", 1608);
        boolean res2 = myMap.isEmpty();


        System.out.println("Name of the student    :"+myMap2.get("name"));
        System.out.println("Age of the student     :"+myMap.get("age"));
        System.out.println("Dept of the student    :"+myMap2.get("dept"));
        System.out.println("Regno of the student   :"+myMap.get("reg no"));
        System.out.println("isEmpty                :"+res2);
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
        System.out.println(myMap.entrySet());
        System.out.println(myMap.containsKey("age"));
        System.out.println(myMap.containsValue(1608));
        System.out.println(myMap.hashCode());
        System.out.println(myMap2.hashCode());
        System.out.println(myMap.remove("age"));
        System.out.println(myMap.toString());
        System.out.println("Replace function :"+myMap.replace("reg no", 20));
        System.out.println(myMap.toString());

        int res  = myMap.size();
        System.out.println(res);



    }
}