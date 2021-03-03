package LinkedList;


public class LinkedList {
    Node head;

    public void insert(int data){
        Node Node = new Node();
        Node.data = data;
        Node.next = null;
        if(head == null){
            head = Node;
        }else{
            Node temp = head;
            while (temp.next != null){
                 temp = temp.next;
            }
            temp.next = Node;

        }
    }

    public void insertAt(int index, int data){
        Node Node = new Node();
        Node.data = data;
        Node.next = null;

        if(index == 0){
            Node.next = head;
            head = Node;
        }else{
            Node temp = head;
            for (int i=0;i<index-1;i++){
                temp = temp.next;
            }
            Node.next = temp.next;
            temp.next = Node;

        }
    }

    public void removeAt(int index){
        if(index == 0){
            head = head.next;
        }else{
            Node Node = head;
            Node t1 = null;
            for(int i=0;i<index-1;i++){
                Node = Node.next;
            }
            t1 = Node.next;
            Node.next = t1.next;
            t1 = null;


        }
    }
    public void displayList(){
        Node Node = head;
        while(Node != null){
            System.out.println(Node.data);
            Node = Node.next;
        }
    }

}






