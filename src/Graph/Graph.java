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
                addChild(father,source);
            }else {
                System.out.println("Father already exist!");
            }

        }else {
            System.out.println("Person does not exist!");
        }
    }

    public void addMother(T source, T mother){
        if(graph.containsKey(source) && graph.containsKey(mother)){
            if(!graph.get(source).containsKey("Mother")){
                graph.get(source).put("Mother",mother);
                graph.get(mother).put("Child",source);
            }else {
                System.out.println("Mother already exist!");
            }
        }else {
            System.out.println("Person does not exist");
        }
    }

    public void addChild(T source, T child){
        if(graph.containsKey(source) && graph.containsKey(child)){
            graph.get(source).put("Child",child);
        }else {
            System.out.println("Person Does not exist!");
        }
    }

    public String print(){

        StringBuilder builder = new StringBuilder();

        for(T vertex : graph.keySet()) {
            builder.append(vertex.toString() + ": ");
            for(String a : graph.get(vertex).keySet()){
                builder.append(a + "=");
                for(T person: graph.get(vertex).values()){
                    builder.append(person);
                    builder.append("\n");
                }
            }
            builder.append("\n");
        }
        return builder.toString();

    }




}
