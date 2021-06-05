package Graph;



public class Main {

    public static void main(String[] args) {


        Family family = new Family();

        family.addFamilyMember(new FamilyMember("Ac","Palabay",true,"07/10/99"));
        family.addFamilyMember(new FamilyMember("Draku","Palabay",true,"07/10/99"));
        family.addFamilyMember(new FamilyMember("Chris","Palabay",true,"07/10/99"));


        family.addSibling("Ac","Draku");
        family.addSibling("Ac","Chris");
        family.addSibling("Ac","Faul");


        System.out.println(family.printTree());
        System.out.println(family.numberOfMembers());

    }


}