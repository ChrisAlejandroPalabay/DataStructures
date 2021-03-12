package LinkedList;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<Person> people = new ArrayList<Person>();

        people.add(new Person("Ac"));
        people.add(new Person("Aaunds"));
        people.add(new Person("draku"));


        System.out.println();
       for (int i=0;i<people.size();i++) {
           System.out.println(people.get(i));
       }



    }
}

