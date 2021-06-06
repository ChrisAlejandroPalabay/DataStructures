package Graph;



public class Main {

    public static void main(String[] args) {


        Family family = new Family();

        family.addFamilyMember(new FamilyMember("Ac","Palabay"));
        family.addFamilyMember(new FamilyMember("Draku","Palabay"));
        family.addFamilyMember(new FamilyMember("Charcoal","Palabay"));
        family.addFamilyMember(new FamilyMember("Alejandro","Palabay"));



        family.addMother(person("Ac","Palabay"),person("Charcoal", "Palabay"));
        family.addFather(person("Ac","Palabay"),person("Draku", "Palabay"));
        family.addSibling(person("Ac","Palabay"),person("Alejandro", "Palabay"));
        family.addChild(person("Draku","Palabay"),person("Ac", "Palabay"));
        family.addChild(person("Charcoal","Palabay"),person("Ac", "Palabay"));
        System.out.println(family.printTree());




    }

    public static FamilyMember person(String fname,String lname){

        FamilyMember temp = new FamilyMember(fname,lname);
        return temp;
    }


}