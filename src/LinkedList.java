



public class LinkedList {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while (temp.next != null){
                 temp = temp.next;
            }
            temp.next = node;

        }
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            node.next = head;
            head = node;
        }else{
            Node temp = head;
            for (int i=0;i<index-1;i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;

        }
    }

    public void removeAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node node = head;
            Node t1 = null;
            for(int i=0;i<index-1;i++){
                node = node.next;
            }
            t1 = node.next;
            node.next = t1.next;
            t1 = null;


        }
    }
    public void displayList(){
        Node node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

}






