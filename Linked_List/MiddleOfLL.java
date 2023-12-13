package Linked_List;

public class MiddleOfLL extends Deletion {
    
    public int middleOfLL()
    {
        int i = 0;
        Node temp = head, temp1 = head;
        while(temp != null)
        {
            i++;
            temp = temp.next;
        }
        for(int j =0; j < i/2; j++)
        {
            temp1 = temp1.next;
        }

        return temp1.data;
    }

    public static void main(String[] args) {
        
        MiddleOfLL list = new MiddleOfLL();
        list.insert(2);
        list.insert(4);
        list.insert(6);
        list.insert(8);
        list.insert(10);
        
        list.displayLL();
        System.out.println();

        int a = list.middleOfLL();
        System.out.println("Middle of LL : " + a );
    }
}
