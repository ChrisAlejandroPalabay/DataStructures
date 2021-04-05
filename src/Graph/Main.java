package Graph;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<ArrayList<Node>> list = new ArrayList<ArrayList<Node>>();

        ArrayList<Node> people = new ArrayList<Node>();



        people.add(new Node(new FamilyMember("Ac",21)));
        people.add(new Node(new FamilyMember("Aundrea",21)));
        people.add(new Node(new FamilyMember("Nicole",21)));

        list.add(people);

        for(int i=0;i<list.get(0).size();i++){
            System.out.println(list.get(0).get(i).data);
        }







    }
}
