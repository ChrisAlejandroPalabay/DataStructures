package BinarySearchTree;

public class FamilyMember {
    public String firstName;
    public int age;

    public FamilyMember(String fname, int age){
        this.firstName = fname;
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "\nName :" + firstName + "\nAge: " + age;
    }
}
