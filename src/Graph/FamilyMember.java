package Graph;

public class FamilyMember {
    public String firstName;


    public FamilyMember(String fname){
        this.firstName = fname;
    }


    @Override
    public String toString() {
        return firstName;
    }
}
