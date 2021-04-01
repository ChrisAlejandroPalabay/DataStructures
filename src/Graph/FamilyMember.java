package Graph;

public class FamilyMember {
    public String firstName;

    public FamilyMember(){

    }
    public FamilyMember(String fname, int age){
        this.firstName = fname;
    }


    @Override
    public String toString() {
        return "Name :" + firstName;
    }
}
