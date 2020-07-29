<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class CountFrequency {
    public static void countFrequencies(ArrayList<String> list) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() + "=" + val.getValue());
        }
    }

}

public class Que2 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("b");
        CountFrequency.countFrequencies(list);
    }
=======
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class CountFrequency {
    public static void countFrequencies(ArrayList<String> list) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println(val.getKey() + "=" + val.getValue());
        }
    }

}

public class Que2 {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("a");
        list.add("b");
        CountFrequency.countFrequencies(list);
    }
>>>>>>> b5515d0... Adv Java
}