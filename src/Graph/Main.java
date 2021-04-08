package Graph;


import java.util.HashMap;


public class Main {

    public static void main(String[] args) {


        Node ac = new Node(new FamilyMember("Ac"));
        Node aundrea = new Node(new FamilyMember("Aundrea"));
        HashMap<Node,Node> map = new HashMap<Node,Node>();
        map.put(ac,aundrea);

        System.out.println(map);
    }
}
