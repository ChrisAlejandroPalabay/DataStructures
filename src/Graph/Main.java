package Graph;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Graph graph = new Graph();

       Node node1 = new Node(new FamilyMember("Ac",21));
       Node node2 = new Node(new FamilyMember("Aundrea",21));
       Node node3 = new Node(new FamilyMember("nicole",21));

       graph.addPerson(new Node(new FamilyMember("Ac",21)));
       graph.addPerson(new Node(new FamilyMember("Aundrea",21)));
       graph.addPerson(new Node(new FamilyMember("Nicole",21)));

       graph.addRelation(node1,node2);
       graph.addRelation(node2,node3);
       graph.addRelation(node3,node1);

        System.out.println(graph.adjlist.get(2).get(0).displayContent());










    }
}
