package Graph;



import java.util.*;

public class Graph<T>{

    private HashMap<T,HashMap<String,T>> graph;

    public Graph(){
        graph = new HashMap<>();
    }

    public void addAndPrint(T data, T to){
        graph.put(data, new HashMap<>());
        graph.get(data).put("Friend", to);

        System.out.println(graph);
    }
}
