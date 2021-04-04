package Graph;


import java.util.LinkedList;

public class Graph{

    int vertices;
    LinkedList<Node> list[];

    public Graph(int vertices){
        this.vertices = vertices;
        list = new LinkedList[vertices];
        for(int i=0;i < vertices;i++){
            list[i] = new LinkedList<Node>();
        }
    }

    public void addEdge(Node s, Node d){
        list[getIndex(list,s)].add(d);
        list[getIndex(list,d)].add(s);
    }

    public void displayGraph(){
        for(int i=0;i < list.length;i++){
            System.out.println(list[i]+" is connected to ");
            if(list[i].size() > 0){
                for(int j=0;j < list[i].size();j++){
                    System.out.println(list[i].get(j));
                }
            }
        }
    }


    public int getIndex(LinkedList<Node> arrayNode[],Node node){
        int index = 0;
        for(int i=0;i<arrayNode.length;i++){
            if(arrayNode[i].get(i) == node.data ){
                index = i;
            }
        }
        return index;
    }
}












/**
public class Graph {

    int vertices;
    LinkedList<Integer> adjList[];

    public Graph(int vertices){
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for(int i=0;i< vertices;i++){
            adjList[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination){
        adjList[source].add(destination);
        adjList[destination].add(source);
    }

    public void displayGraph(){
        for(int i=0;i < vertices;i++){
            if(adjList[i].size() > 0){
                System.out.println("Vertex " + i +" is connected to - ");
                for(int j=0;j< adjList[i].size();j++){
                    System.out.print(adjList[i].get(j)+",");
                }
                System.out.println();
            }
        }
    }


}
 ***/
