
public class Main {

    public static void main(String[] args){

        LinkedList list = new LinkedList();


        list.insert(888);//0
        list.insert(888);//2
        list.insertAt(1,67);
        list.insert(888);//3
        list.removeAt(2);
        list.displayList();

    }
}

