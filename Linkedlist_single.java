public class Linkedlist_single
{
class Node
{
private int head=null;
private int data;
}
public Node next=null;
public void add(Object data)
{
Node n1=new Node();
if(head==null)
n1.next=head;
n1.head=data;
n1.next=next;
}
public static void main(String[] args)
{
Linkedlist_single n1=new Linkedlist_single();
n1.add(10);
System.out.println("data added");
n1.add(20);
System.out.println("second data added");
}
}



