package Graph;



public class Main {

    public static void main(String[] args) {


        Family family = new Family();

        family.addFamilyMember(new FamilyMember("Ac","Palabay",true));
        family.addFamilyMember(new FamilyMember("Mother","Palabay",false));
        family.addFamilyMember(new FamilyMember("Father","Palabay",true));
        family.addFamilyMember(new FamilyMember("Alejandro","Palabay",true));

        family.addPartner(person("Mother","Palabay",false),person("Father","Palabay",true));

        System.out.println(family.printTree());


    }

    public static FamilyMember person(String fname,String lname, boolean gender){

        FamilyMember temp = new FamilyMember(fname,lname,gender);
        return temp;
    }


}