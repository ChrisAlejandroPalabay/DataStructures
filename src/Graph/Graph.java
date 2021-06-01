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
            if(!checkRelatives(source).contains(sibling)){
                map.get(source).put("Sibling",sibling);
            }else {
                System.out.println("Person already a relative");
            }
        }else{
            System.out.println("Person does not exist!");
        }
    }


    public String printTree(){
        StringBuilder builder = new StringBuilder();
        for(T person: map.keySet()){
            builder.append(person + "\n");
            for(String value: map.get(person).keySet()){
                builder.append("        " + value + ":\n");
                for(T v: map.get(person).get(value)){
                    builder.append("         * " + v + "\n");
                }
            }
            builder.append("\n");
        }


        return builder.toString();
    }

    public String printFamily(T person){
        StringBuilder builder = new StringBuilder();
        builder.append(person +"'s Family"+ "\n");
        for(String v:map.get(person).keySet()){
            builder.append("       "+ v + "\n");
            for (T p1: map.get(person).get(v)){
                builder.append("          * " + p1 + "\n");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    private Collection<T> checkRelatives(T person){
        Collection values = map.get(person).values();
        return values;
    }



}


