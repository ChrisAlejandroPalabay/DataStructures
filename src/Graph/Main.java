package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();
        graph.addFamilyMember(new FamilyMember("Ac"));
        graph.addFamilyMember(new FamilyMember("Draku"));
        graph.addFamilyMember(new FamilyMember("Charcoal"));
        graph.addFamilyMember(new FamilyMember("Nica"));


        graph.addSibling(new FamilyMember("Ac"),new FamilyMember("Draku"));
        graph.addFather(new FamilyMember("Draku"),new FamilyMember("Charcoal"));
        graph.addMother(new FamilyMember("Ac"),new FamilyMember("Nica"));
        graph.addChild(new FamilyMember("Charcoal"),new FamilyMember("Ac"));


        System.out.println(graph.print());
    }
}
