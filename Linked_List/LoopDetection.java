package Linked_List;

public class LoopDetection extends Deletion {
    
    public void detectLoop()
    {
        Node slow = head, fast = head;
        int flag = 0;

        while(slow != null && fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
            {
                flag = 1;;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Loop Exists !");
            return;
        }
        else{
            System.out.println("Loop dose not exist !");
            return;
        }
    }

    public static void main(String[] args) {
        
        LoopDetection list = new LoopDetection();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        // list.displayLL();

        Node temp = list.head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = list.head;

        list.detectLoop();
    }
}
