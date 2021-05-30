package Graph;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class builder {

    public static void main(String[] args) {

        Map<String,Multimap<String,String>> map = new HashMap<>();
        Multimap<String,String> list = ArrayListMultimap.create();
        map.put("Ac",list);

    }
}
