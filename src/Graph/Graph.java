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
        if(graph.containsKey(person)) {
            if(!graph.get(person).containsKey("Father")){
                graph.get(person).put("Father",father);
            }else{
                System.out.println("Father already exist!");
            }
        }else {
            System.out.println("Person does not exist!");
        }
    }

    public void addChild(T person, T child){
        if(graph.containsKey(person)) {
            if(!graph.get(person).containsKey("Child")){
                graph.get(person).put("Child",child);
            }else{
                System.out.println("Child already exist!");
            }
        }else {
            System.out.println("Person does not exist!");
        }
    }


}
