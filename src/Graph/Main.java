package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();
        graph.addFamilymember(new FamilyMember("Ac"));
        graph.addFather(new FamilyMember("Ac"),new FamilyMember("Draku"));
        graph.addChild(new FamilyMember("Ac"),new FamilyMember("Nicole"));
        


        graph.print();
    }
}
