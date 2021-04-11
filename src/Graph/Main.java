package Graph;


import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        Map <FamilyMember, LinkedList<FamilyMember>> map = new HashMap<>();

        map.put(new FamilyMember("Ac"),new LinkedList<FamilyMember>());
        map.put(new FamilyMember("Draku"),new LinkedList<FamilyMember>());
        map.put(new FamilyMember("Ac"),new LinkedList<FamilyMember>());

        FamilyMember temp = new FamilyMember("Ac");

        if(map.containsKey(temp)){
            System.out.println("works");
        }else {
            System.out.println("f");
        }


    }
}
