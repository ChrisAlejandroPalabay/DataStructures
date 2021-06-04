package Graph;

public class FamilyMember extends Person{
    public String firstName;


    public FamilyMember(String fname){
        this.firstName = fname;
    }


    @Override
    public int hashCode() {
        return firstName.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        FamilyMember fm = (FamilyMember) o;
        return firstName == fm.firstName;
    }


    @Override
    public String toString() {
        return firstName;
    }
}