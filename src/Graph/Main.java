package Graph;



public class Main {

    public static void main(String[] args) {


        Family family = new Family();

        family.addFamilyMember(new FamilyMember("Father","Palabay",true));
        family.addFamilyMember(new FamilyMember("Mother","Palabay",false));



        family.addPartner("Mother Palabay","Father Palabay");
        System.out.println(family.printTree());


    }

    public static FamilyMember person(String fname,String lname, boolean gender){

        FamilyMember temp = new FamilyMember(fname,lname,gender);
        return temp;
    }


}