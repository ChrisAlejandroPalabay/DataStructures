package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();
        graph.addFamilyMember(new FamilyMember("Ac"));
        graph.addFamilyMember(new FamilyMember("Draku"));

        graph.addSibling(new FamilyMember("Ac"),new FamilyMember("Draku"));
        graph.print();
    }
}
