package Linked_List;

public class ReversingLL extends Deletion {

    // Reversing the Linkedlist Iteratively
    public void reverseLL()
    {
        Node n = null;
        Node prev = null;
        Node curr = head;

        while(curr != null)
        {
            // System.out.print(curr.data + " ");
            n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        head = prev;
        
    }

    // Reversing the linkedlist Recursively
    public void reverseLL(Node prev, Node curr)
    {
        if(curr.next == null)
        {
            head = curr;
            curr.next = prev;
            return;
        }
        else
        {
            Node nextPtr = curr.next;
            curr.next = prev;
            reverseLL(curr, nextPtr);
        }
    }
        

    public static void main(String[] args) {

        ReversingLL list = new ReversingLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(10);
        list.displayLL();
        System.out.println();

        list.reverseLL(null, list.head);
        list.displayLL();
        System.out.println();

    }
}
