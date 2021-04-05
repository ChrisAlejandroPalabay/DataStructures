package Graph;


import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Node>> adjlist;


    public Graph(){
        adjlist = new ArrayList<ArrayList<Node>>();
    }

    public void addPerson(Node node){
        ArrayList<Node> branch = new ArrayList<Node>();
        branch.add(node);
        adjlist.add(branch);
    }

    public void addRelation(Node source, Node destination){
        for(int i=0; i < adjlist.size();i++){
            if(adjlist.get(i).get(0).data == source.data){
                adjlist.get(i).add(destination);
            }
        }
    }

    public void displayGraph(){
        for(int i=0;i<adjlist.size();i++){
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.println("Vertex: " + adjlist.get(i).get(j).data+" is connected to" + adjlist.get(i).get(j+1).data);
            }
        }
    }
}