package Graph;



import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;

public class Family {

    private HashMap<FamilyMember, Multimap<String, FamilyMember>> map;

    public Family() {
        map = new HashMap<>();
    }


    public void addFamilyMember(FamilyMember person){
        if(map.containsKey(person)){
            System.out.println("Person already exist!");
        }else {
            Multimap<String,FamilyMember> temp = ArrayListMultimap.create();
            map.put(person,temp);
        }
    }

    public void addSibling(String fname1, String fname2) {
        int interations1 = 0;
        int interations2 = 0;
        for(FamilyMember f1: map.keySet()){
            if(f1.firstName == fname1){
                for (FamilyMember f2: map.keySet()){
                    if(f2.firstName == fname2){
                        map.get(f1).put("Sibling",f2);

                    }else if(interations2 == map.size()){
                        System.out.println("Person does not exist!");
                    }
                    interations2++;
                }
            }else if(interations1 == map.size()){
                System.out.println("Person does not exist!");
            }
            interations1++;
        }
    }

    public void addMother(FamilyMember person1, FamilyMember person2){
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

    public void addFather(FamilyMember person1,FamilyMember person2){
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
        for(FamilyMember person: map.keySet()){
            builder.append(person + "\n");
            for(String value: map.get(person).keySet()){
                builder.append("        " + value + ":\n");
                for(FamilyMember v: map.get(person).get(value)){
                    builder.append("         * " + v + "\n");
                }
            }
            builder.append("\n");
        }


        return builder.toString();
    }

    public String printFamily(FamilyMember person){
        StringBuilder builder = new StringBuilder();
        builder.append(person +"'s Family"+ "\n");
        for(String v:map.get(person).keySet()){
            builder.append("       "+ v + "\n");
            for (FamilyMember p1: map.get(person).get(v)){
                builder.append("          * " + p1 + "\n");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

    private Collection checkRelatives(FamilyMember person){
        Collection values = map.get(person).values();
        return values;
    }

    public int numberOfMembers(){
        return map.size();
    }

}