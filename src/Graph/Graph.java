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

    public void addSibling(T person1, T person2) {
        if(map.containsKey(person1) && map.containsKey(person2)){
            if(!checkRelatives(person1).contains(person2)){
                map.get(person1).put("Sibling",person2);
            }else {
                System.out.println("Person already a sibling of "+ person1);
            }
        }else{
            System.out.println("Person does not exist!");
        }
    }

    public void addMother(T person1, T person2){
        if(map.containsKey(person1) && map.containsKey(person2)){
            if(!checkRelatives(person1).contains(person2)){
                map.get(person1).put("Mother",person2);
            }else {
                System.out.println("Person already a mother of "+ person1);
            }
        }else{
            System.out.println("Person does not exist!");
        }
    }

    public void addFather(T person1,T person2){
        if(map.containsKey(person1) && map.containsKey(person2)){
            if(!checkRelatives(person1).contains(person2)){
                map.get(person1).put("Father",person2);
            }else {
                System.out.println("Person already a father of "+ person1);
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

    private void connectFamily(T person1,T person2){

    }



}


