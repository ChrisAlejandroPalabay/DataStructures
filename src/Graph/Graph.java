package Graph;



import java.util.*;

public class Graph<T>{

    private HashMap<T,HashMap<String,T>> graph;

    public Graph(){
        graph = new HashMap<>();
    }

    public void addFamilymember(T data){
       if(!graph.containsKey(data)){
           graph.put(data,new HashMap<>());
       }else {
           System.out.println("Person Already exist");
       }
    }

    public void print(){
        System.out.println(graph);
    }

    public void addFather(T person, T father){
        if(graph.get(person).containsKey("Father")){
            System.out.println("Father already exist");
        }
    }



}
