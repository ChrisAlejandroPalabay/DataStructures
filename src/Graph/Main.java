package Graph;

public class Main {

    public static void main(String[] args) {

        Graph test = new Graph(4);

        test.addConnection(1,2);
        test.addConnection(2,3);
        test.displayGraph();
    }
}
