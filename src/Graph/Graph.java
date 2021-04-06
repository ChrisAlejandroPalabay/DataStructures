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

    public void addRelation(String name, String destination){
        for(int i=0;i < adjlist.size();i++){
            if("Ac" == name ){
                adjlist.get(i).add(new Node(new FamilyMember(destination)));
            }
        }

    }

    public void displayGraph(){

        if(adjlist.get(0).get(0).data == "Name :Ac"){
            System.out.println(adjlist.get(0).get(0).data);
            System.out.println(adjlist.get(0).get(1).data);
        }else {
            System.out.println("Wrong conditoion");
        }


       /***
        for(int i=0;i<adjlist.size();i++){
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.println("Vertex: " + adjlist.get(i).get(j).data+" is connected to" + adjlist.get(i).get(j+1).data);
            }
        }
        */
    }
}