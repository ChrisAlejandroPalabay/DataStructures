package Graph;

import LinkedList.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<LinkedList> listOfNode[] = new LinkedList[3];

        LinkedList fam1 = new LinkedList();
        LinkedList fam2 = new LinkedList();
        LinkedList fam3 = new LinkedList();

        fam1.insert(new FamilyMember("ac1",21));
        fam1.insert(new FamilyMember("ac1",21));

        fam2.insert(new FamilyMember("ac2",21));
        fam2.insert(new FamilyMember("ac2",21));

        fam2.insert(new FamilyMember("ac3",21));
        fam2.insert(new FamilyMember("ac3",21));


        listOfNode[0] = fam1;
        listOfNode[1] = fam2;
        listOfNode[2] = fam3;


        for(int i=0;i < listOfNode.length;i++){
            listOfNode[i].displayList();
            System.out.println();
        }

    }
}
