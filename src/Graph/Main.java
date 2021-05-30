package Graph;



public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addFamilyMember(new FamilyMember("Ac"));
        graph.addFamilyMember(new FamilyMember("Draku"));
        graph.addFamilyMember(new FamilyMember("Charcoal"));

        graph.addSibling(new FamilyMember("Ac"),new FamilyMember("Draku"));
        graph.addSibling(new FamilyMember("Ac"),new FamilyMember("Charcoal"));

        graph.addSibling(new FamilyMember("Draku"),new FamilyMember("Ac"));
        graph.addSibling(new FamilyMember("Draku"),new FamilyMember("Charcoal"));

        graph.addSibling(new FamilyMember("Charcoal"),new FamilyMember("Draku"));
        graph.addSibling(new FamilyMember("Charcoal"),new FamilyMember("Ac"));


        System.out.println(graph.print());
    }
}
