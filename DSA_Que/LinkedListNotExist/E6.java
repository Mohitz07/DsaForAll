package DSA_Que.LinkedListNotExist;
class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class E6 {
    public static Node sort0s1s2s(Node head) {
        if(head == null || head.next == null) return null;
        
        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;
        // Step 1 : count the number of 0s 1s 2s
        while(temp != null) {
            if(temp.data == 0) count0++;
            else if(temp.data == 1) count1++;
            else count2++;
            temp = temp.next;
        }
        //step 2: reset temp to head
        temp = head;

        //Step 3: Overwrite the list with 0s, then 1s, then 2s
        while(count0-- > 0) {
            temp.data = 0;
            temp = temp.next;
        }
        while(count1-- > 0) {
            temp.data = 1;
            temp = temp.next;
        }
        while(count2-- >0) {
            temp.data = 2;
            temp = temp.next;
        }
        return head;

    }
    public static void printLL(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with some nodes
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(0);
        head.next.next.next.next = new Node(2);
        head.next.next.next.next.next = new Node(0);
        head.next.next.next.next.next.next = new Node(1);

        System.out.println("Original List");
        printLL(head);
        head = sort0s1s2s(head);

        System.out.println("Sorted List");
        printLL(head);

    }
}
