package Graph;

public class Main {

    public static void main(String[] args) {

        Graph test = new Graph(4);

        test.addEdge(1,2);
        test.addEdge(2,3);
        test.displayGraph();
    }
}
