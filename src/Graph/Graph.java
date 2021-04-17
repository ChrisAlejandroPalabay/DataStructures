package Graph;



import java.util.*;

public class Graph<T>{

    private HashMap<T,LinkedList<T>> graph;

    public Graph(){
        graph = new HashMap<>();
    }


    public void addEdge(T source,T destination, boolean biConditional){

        if (!graph.containsKey(source)){
            addVertex(source);
        }

        if (!graph.containsKey(destination)){
            addVertex(destination);
        }

        if (biConditional == true){
            graph.get(source).add(destination);
            graph.get(destination).add(source);
        }else {
            graph.get(source).add(destination);
        }
    }

    public void searchPerson(T person){
        if(graph.containsKey(person)){
            System.out.println("Person Exists, having connections with");
            System.out.println(graph.get(person));
        }else{
            System.out.println("Person does not exist!");
        }
    }

    private void addVertex(T vertex){
        graph.put(vertex,new LinkedList<T>());
    }

    public String printGraph() {
        StringBuilder builder = new StringBuilder();

        for(T vertex : graph.keySet()) {
            builder.append(vertex.toString() + ": ");
            for(T node: graph.get(vertex)) {
                builder.append(node.toString() + " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }



}
