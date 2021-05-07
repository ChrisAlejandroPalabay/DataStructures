package Graph;

public class builder {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        int[] array = new int[10];

        for(int i=0;i < 5;i++){
            array[i] = i;
            System.out.println(array[i]);
            builder.append(array[i]);
        }

        builder.append("Ac");
        System.out.println(builder);



    }
}
