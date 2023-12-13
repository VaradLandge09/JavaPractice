package Linked_List;


// Finding th middle of the element by two pointer approach
public class Middle2 extends Deletion{
    
    public void middleOfLL2()
    {

        Node fast = head, slow = head;
        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Middle2 list = new Middle2();

        
        

        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        
        
        list.displayLL();
        System.out.println();

        list.middleOfLL2();
    }
}
