package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();

        graph.addEdge(new FamilyMember("Ac"),new FamilyMember("Chris"),true);
        graph.addEdge(new FamilyMember("Paul"),new FamilyMember("Jake"),true);
        graph.addEdge(new FamilyMember("Paul"),new FamilyMember("Ac"),true);

        graph.print(new FamilyMember("A"));

    }
}
