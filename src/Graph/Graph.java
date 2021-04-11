package Graph;



import java.util.HashMap;
import java.util.LinkedList;

public class Graph<T>{

   HashMap<T,LinkedList<T>> map;

   public Graph(){
       map  = new HashMap<>();
   }

   public void addItem(T key){
       map.put(key,new LinkedList<T>());
   }

   public void printGraph(){
       System.out.println(map);
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