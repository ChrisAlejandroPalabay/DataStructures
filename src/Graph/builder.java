package Graph;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class builder {

    public static void main(String[] args) {


        ArrayList<FamilyMember> fam = new ArrayList<>();

        FamilyMember p1 = new FamilyMember("Chirs","Palabay",true);
        FamilyMember p2 = new FamilyMember("Alej","Palabay",true);
        FamilyMember p3 = new FamilyMember("Josh","Palabay",true);
        FamilyMember p4 = new FamilyMember("Ac","Palabay",true);

        fam.add(p1);
        fam.add(p2);
        fam.add(p3);
        fam.add(p4);

        System.out.println(fam.get(inderOf(p3,fam)).getFullName());
        System.out.println(fam.get(inderOf(p3,fam)).gender);

        System.out.println(fam.get(inderOf(p1,fam)).getFullName());
        System.out.println(fam.get(inderOf(p3,fam)).gender);


    }

    public static int inderOf(FamilyMember p1,ArrayList array){
        int res = 0;
        for (int i=0;i < array.size();i++){
            if(array.get(i).equals(p1)){
                res = i;
                break;
            }
        }
        return res;
    }

}

