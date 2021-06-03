package Graph;

public class Person  {
    public String firstName;
    public String LastName;
    public boolean gender;
    public String birthDay;

    public Person(String firstName, String lastName, boolean gender, String bDay){

        this.firstName = firstName;
        this.LastName = lastName;
        this.gender = gender;
        this.birthDay = bDay;
    }

    //setters

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    //getters


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getGender() {
        String gender = "Male";
        if(this.gender == true){
            gender = "Male";
        }else {
            gender = "Female";
        }
        return gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
