package Graph;



import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class Graph<T> {

    private HashMap<T, Multimap<String, T>> map;

    public Graph() {
        map = new HashMap<>();
    }


    public void addFamilyMember(T person){
        if(map.containsKey(person)){
            System.out.println("Person already exist!");
        }else {
            Multimap<String,T> temp = ArrayListMultimap.create();
            map.put(person,temp);
        }
    }

    public void addSibling(T source, T sibling) {
        if(map.containsKey(source) && map.containsKey(sibling)){
            if(!getValues(source).contains(sibling)){
                map.get(source).put("Sibling",sibling);
            }else {
                System.out.println("Person already a relative");
            }
        }else{
            System.out.println("Person does not exist!");
        }
    }


    public String print(){
        StringBuilder builder = new StringBuilder();
        for(T person: map.keySet()){
            builder.append(person + "\n");
            for(String value: map.get(person).keySet()){
                builder.append("         " + value + ":\n");
                for(T v: map.get(person).get(value)){
                    builder.append("           " + v + "\n");
                }
            }
            builder.append("\n");
        }


        return builder.toString();
    }

    public Collection<T> getValues(T person){
        Collection values = map.get(person).values();
        return values;
    }

}


