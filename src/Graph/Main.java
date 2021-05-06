package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();
        graph.addFamilyMember(new FamilyMember("Ac"));
        graph.addFamilyMember(new FamilyMember("Draku"));
        graph.addFamilyMember(new FamilyMember("Chris"));
        graph.addFamilyMember(new FamilyMember("Paul"));
        graph.addFamilyMember(new FamilyMember("Charcoal"));


        graph.print();

        graph.addSibling(new FamilyMember("Ac"),new FamilyMember("Draku"));
        graph.addFather(new FamilyMember("Ac"),new FamilyMember("Chris"));
        graph.addMother(new FamilyMember("Ac"),new FamilyMember("Charcoal"));

        System.out.println(graph.print());
    }
}
