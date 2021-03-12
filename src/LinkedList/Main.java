package LinkedList;

public class Main {

    public static void main(String[] args){

        LinkedList<Person> people = new LinkedList<Person>();

        people.insert(new Person("Ac"));
        people.insert(new Person("Aundrea"));

        people.displayList();

    }
}

