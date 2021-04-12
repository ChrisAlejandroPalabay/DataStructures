package Graph;



public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph();

        FamilyMember ac = new FamilyMember("Ac");

        graph.addVertex(new FamilyMember("Ac"), new FamilyMember("Aundrea"));
        graph.print();


    }
}
