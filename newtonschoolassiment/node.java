package newtonschoolassiment;

public class node {
    int value;
    node next;
    node (int nodeValue){
        value=nodeValue;
}
public class LinkedListExample {
    static node head;
    public static void printLL(){
        node run=head;
        while(run!=null){
            System.out.println(run.value+" ");
            run=run.next;
        } 
        System.out.println();
    } 
    static void insertAtEnd(int number){
        node temp=new node(number);
        if(head==null){
            head=temp;
        } else{
            node run =head;
        
        while(run.next!=null){
            run=run.next;
        }
        run.next=temp;
       
    }
    }
    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);
        printLL();
    }
}
}
