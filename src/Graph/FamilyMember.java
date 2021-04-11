package Graph;

public class FamilyMember {
    public String firstName;


    public FamilyMember(String fname){
        this.firstName = fname;
    }


    public boolean equals(Object obj){
        FamilyMember f = (FamilyMember) obj;

        if(this.firstName != f.firstName){
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return firstName;
    }
}
