package DataStructures.Linkedlist;

/**
 * Created by Soumya on Sep,2020
 */
class Node{
    int data;
    Node next;
}
class LinkedListSetup{
    private Node getnewNode(int data){
        Node a = new Node();
        a.data=data;
        a.next=null;
        return a;
    }
    public Node insert(int i,Node node){
        if(node==null){
            return getnewNode(i);
        }
        else
            node.next= insert(i,node.next);
        return node;

    }
    public void printList(Node node){
        if(node==null)
            return;
        System.out.print(node.data+" ");
        printList(node.next);

    }

}
public class CreateLinkedList {
    public static void main(String[] args) {
        Node root=null;
        LinkedListSetup linkedListSetup= new LinkedListSetup();
        linkedListSetup.printList(root);
        System.out.println(" ");
        root=linkedListSetup.insert(12,root);
        root=linkedListSetup.insert(37,root);
        root=linkedListSetup.insert(99,root);
        linkedListSetup.printList(root);
        System.out.println();
        root=linkedListSetup.insert(100,root);
        linkedListSetup.printList(root);

    }
}
