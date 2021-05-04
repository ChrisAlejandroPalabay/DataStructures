package Graph;



import java.util.*;

public class Graph<T>{

    private HashMap<T,HashMap<String,T>> graph;

    public Graph(){
        graph = new HashMap<>();
    }

    public void addFamilyMember(T person){
        if(!graph.containsKey(person)){
            graph.put(person,new HashMap<>());
        }else {
            System.out.println("Family Member already exists!");
        }
    }

    public void addSibling(T source,T sibling){
        if(graph.containsKey(source) && graph.containsKey(sibling)){
            graph.get(source).put("Sibling",sibling);
            graph.get(sibling).put("Sibling",source);
        }else {
            System.out.println("Person Does not exist!");
        }
    }

    public void addFather(T source, T father){
        if(graph.containsKey(source) && graph.containsKey(father)){
            if(!graph.get(source).containsKey("Father")){
                graph.get(source).put("Father",father);

                if(graph.get(source).containsKey("Sibling")){
                    
                }
            }else {
                System.out.println(" Father already exist!");
            }

        }else {
            System.out.println("Person does not exist!");
        }
    }

    public void print(){
        System.out.println(graph);
    }




}
