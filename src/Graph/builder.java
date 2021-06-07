package Graph;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class builder {

    public static void main(String[] args) {


        ArrayList<FamilyMember> fam = new ArrayList<>();
//        fam.add(new FamilyMember("Ac","Palabay"));
//        fam.add(new FamilyMember("Chris","Palabay"));
//        fam.add(new FamilyMember("Alejandro","Palabay"));
//        fam.add(new FamilyMember("Aundrea","Palabay"));
//        fam.add(new FamilyMember("Nicole","Palabay"));
//
//        System.out.println(fam.get(inderOf(new FamilyMember("Aundrea","Palabay"),fam)));


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

    public static boolean res(int num){
        return num > 10 || num == 1;
    }

}

