package Graph;





public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addEdge("AC","Aundrea",true);
        graph.addEdge("Nicole","Aundrea",true);
        graph.addEdge("Draku","Nic",true);
        graph.addEdge("Chris","lo",true);
        graph.addEdge("Alejandro","e",true);
        graph.printGraph();

        System.out.println();
    }
}
