package Graph;


import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addItem(new FamilyMember("Ac"));
        graph.addItem(new FamilyMember("Draku"));
        graph.addItem(new FamilyMember("Mouse"));

        HashMap<String, LinkedList<FamilyMember>> map = new HashMap<String, LinkedList<FamilyMember>>();

        map.put("Ac",new LinkedList<FamilyMember>());
        map.put("Draku",new LinkedList<FamilyMember>());


        if(map.containsKey("Ac")){
            System.out.println(map.get("Ac"));
        }else {
            System.out.println("fails");
        }
    }
}
