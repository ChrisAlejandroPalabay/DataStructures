package BinarySearchTree;

public class Main {

    public static void main(String[] args) {

        BinarySearchTree<FamilyMember> familyTree = new BinarySearchTree();

        familyTree.add(new FamilyMember("Ac",21));
        familyTree.add(new FamilyMember("Aundrea",22));
        familyTree.add(new FamilyMember("Nicole",23));
        familyTree.add(new FamilyMember("Wong",24));

        familyTree.printTree(familyTree.traverse());
    }
}
