package Graph;

import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int numberOfNodes;


    public Graph(int nodes){
        numberOfNodes = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i < numberOfNodes;i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int source,int destination){
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    public void print(){
        for(int i=0;i<graph.size();i++){
            System.out.print("Node " + i );
            for (int x :graph.get(i)){
                System.out.print("-->" + x);
                System.out.println();
            }
        }
    }


}
