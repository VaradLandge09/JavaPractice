package Linked_List;



public class Insertion
{
    Node head = null;

    // Creation of Node
    class Node
    {
        int data;
        Node next;

        Node(int d)
        {
            this.data = d;
            this.next = null;
        }
    }

    // Insertion of node at End 
    public void insert(int data)
    {
        Node newNode = new Node(data);

        if(head == null)    // If list is empty
        {
            head = newNode;
            return;
        }

        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
            return;
        }

    }

    // Insertion of node at Start
    public void insertAtStart(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insertion of node at any Postion
    public void insertAtLocation(int dataOfInsertion, int location)
    {
        int i= 1;
        Node newNode = new Node(dataOfInsertion);
        Node temp = head;
        if(location == 1)
        {
            newNode.next = temp;
            head = newNode;
            return;
        }

        while(i < location-1)
        {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
        
        
    }

    // Displaying of Linked list
    public void displayLL()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Insertion list = new Insertion();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.displayLL();
        
        System.out.println();
        
        list.insertAtStart(5);
        list.displayLL();
        
        System.out.println();

        list.insertAtLocation(7, 6);
        list.displayLL();
        
    }
}
