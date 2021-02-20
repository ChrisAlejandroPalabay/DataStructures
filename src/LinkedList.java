



public class LinkedList {
    Node head;



    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null){
            head = node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }
    }

    public void insertAtindex(int index,int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            node.next = head;
            head = node;

        }else {
            Node n = head;
            for(int i=0;i<index-1;i++){
                n = n.next;
            }
           node.next = n.next;
            n.next = node;
        }
    }
    public void removeAt(int index){

        Node temp = head;
        Node t1 = null;
        for(int i=0;i<index-1;i++){
            temp = temp.next;
        }
        t1 = temp.next;
        temp.next = t1.next;
        t1 = null;

    }

    public void displayList(){
        Node node = head;
        while (node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }

   }



