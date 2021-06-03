package Graph;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class builder {

    public static void main(String[] args) {

      Person person = new Person("AC", "Palabay", true, "07/10/1999");

        System.out.println(person.toString());
        System.out.println(person.getGender());
    }

}

