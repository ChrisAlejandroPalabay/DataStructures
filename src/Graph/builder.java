package Graph;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class builder {

    public static void main(String[] args) {


        Multimap<String,String> map = ArrayListMultimap.create();
        map.put("Me","Ac");
        map.put("Me","Draku");
        map.put("Me","Charcoal");

        
        System.out.println(map.get("Me"));
    }
}
