package LinkedList;

public class Stack {

    int stack[] = new int[5];
    int top = 0;

    public void push(int data){

        stack[top] = data;
        top++;
    }

    public void pop(){
        int data;
        top--;
        data = stack[top];
        stack[top] = 0;
    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public void show(){
        for(int i=0;i<stack.length;i++){
            System.out.println(stack[i]);
        }
    }
}
