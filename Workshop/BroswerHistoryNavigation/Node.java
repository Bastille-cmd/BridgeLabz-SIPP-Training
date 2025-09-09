public class Node {
    String data;
    Node next=null;
    Node prev=null;

    Node(String data){
        this.data=data;
    }

    Node(String data, Node next, Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

}
