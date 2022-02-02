import java.util.LinkedList;
import java.util.Scanner;
class Node
{
    int data;
    Node next;
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
public class Main
{
    public static void printList(Node head)
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }
    public static Node reverse(Node head)
    {
        Node previous = null;
        Node current = head;
        while (current != null)
        {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int keys[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            keys[i] = sc.nextInt();
        }
        Node head = null;
        for (int i = size - 1; i >= 0; i--)
        {
            head = new Node(keys[i], head);
        }
        head = reverse(head);
        printList(head);
    }
}