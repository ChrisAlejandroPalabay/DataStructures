package Graph;

public class Main {

    public static void main(String[] args) {


        Graph graph = new Graph(10);
        graph.addEdge(1,1);
        graph.addEdge(4,5);
        graph.addEdge(6,7);
        graph.addEdge(8,9);

        graph.print();

    }
}
