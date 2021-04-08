package Graph;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Graph<T> {

    HashMap<T , List<T>> graph = new HashMap<T, List<T>>();

    public void addVertex(T node){
        graph.put(node,new LinkedList<T>());
    }

    public void addEdge(T source, T destination, boolean biDirectional) {
        if (!graph.containsKey(source)) {
            addVertex(source);
        }

        if (!graph.containsKey(destination)) {
            addVertex(destination);
        }

        graph.get(source).add(destination);
        if(biDirectional == true) {
            graph.get(destination).add(source);
        }
    }

    public void printGraph(){
        System.out.println(graph);
    }












    /**
    ArrayList<ArrayList<Node>> adjlist;


    public Graph(){
        adjlist = new ArrayList<ArrayList<Node>>();
    }

    public void addPerson(Node node){
        ArrayList<Node> branch = new ArrayList<Node>();
        branch.add(node);
        adjlist.add(branch);
    }

    public void addRelation(T source, T destination){
        for(int i=0;i < adjlist.size();i++){
            if(adjlist.get(i).get(0).data == source ){
                adjlist.get(i).add(new Node(destination));
            }
        }

    }

    public void displayGraph(){
        System.out.println(adjlist.get(0).get(0));
        System.out.println(adjlist.get(0).get(1));
    }
     **/
}