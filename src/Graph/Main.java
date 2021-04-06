package Graph;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Graph graph = new Graph();

       graph.addPerson(new Node(new FamilyMember("Ac")));
       graph.addPerson(new Node(new FamilyMember("Aundrea")));
       graph.addPerson(new Node(new FamilyMember("Nicole")));

       graph.addRelation("Ac","Aundrea");

       graph.displayGraph();










    }
}
