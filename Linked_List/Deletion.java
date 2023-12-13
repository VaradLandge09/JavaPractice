package Linked_List;

public class Deletion extends Insertion {
    
    // Deletion of node from its position
    public void deleteFromPosition(int position)
    {
        if(head == null)
        {
            return;
        }
        Node temp = head;
        if(position == 0)
        {
            head = temp.next;
            return;
        }

        for(int i = 0; i < position-1 && temp != null; i++)
        {
            temp = temp.next;
        }
        if(temp == null)
        {
            return;
        }
        temp.next = temp.next.next;
    }

    // Deletion of node from its data
    public void deleteFromData(int dataOfNode)
    {
        Node temp = head;
        if(temp.data == dataOfNode)
        {
            head = temp.next;
            return;
        }
        while(temp.next.data != dataOfNode && temp.next != null)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            return;
        }
        
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Deletion list = new Deletion();
        
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(10);
        list.insert(12);
        list.displayLL();
        System.out.println();

        list.deleteFromData(12);
        list.displayLL();
        System.out.println();
    }
}
