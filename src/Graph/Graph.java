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
        if(graph != null){
            if(graph.containsKey(person)) {
                if(!graph.get(person).containsKey("Father")){
                    graph.get(person).put("Father",father);
                    if(!graph.containsKey(father)){
                        addFamilymember(father);
                        addChild(father,person);
                    }
                }else{
                    System.out.println("Father already exist!");
                }
            }else {
                System.out.println("Person does not exist!");
            }
        }else{
            System.out.println("There are no members in the family");
        }

    }

    public void addChild(T person, T child){
        if(graph.containsKey(person)) {
            if(!graph.get(person).containsKey("Child")){
                graph.get(person).put("Child",child);
                if(!graph.containsKey(child)){
                    addFamilymember(child);
                    addChild(child,person);
                }
            }else{
                System.out.println("Child already exist!");
            }
        }else {
            System.out.println("Person does not exist!");
        }
    }


}
