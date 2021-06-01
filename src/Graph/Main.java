package Graph;



public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addFamilyMember(new FamilyMember("Ac"));
        graph.addFamilyMember(new FamilyMember("Draku"));
        graph.addFamilyMember(new FamilyMember("Charcoal"));

        graph.addSibling(person("Ac"),person("Charcoal"));
        graph.addSibling(person("Ac"),person("Draku"));


        System.out.println(graph.printTree());
        System.out.println(graph.printFamily(person("Ac")));

    }

    public static FamilyMember person(String p){
        FamilyMember temp = new FamilyMember(p);
        return temp;
    }


}
