
public class Main {

    public static void main(String[] args){

        LinkedList list = new LinkedList();


        list.insert(888);//0
        list.insert(2);//1
        list.insert(888);//2
        list.insert(888);//3
        list.insertAtindex(4,11);
        list.removeAt(1);

        list.displayList();

    }
}

