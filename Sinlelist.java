public class Sinlelist
{
class Node
{
private int data;
private Node next;
 public Node(int data)
{
this.data=data;
}
}
Node head=null;
Node tail=null;
public void add(int data)
{
Node n1=new Node(data);
if(head==null)
{
head=n1;
return;
}
Node temp=head;
while(temp.next!=null)
{
temp=temp.next;
}
temp.next=n1;
}
public static void main(String[] args)
{
Sinlelist s1=new Sinlelist();
System.out.println("data are getting added");
s1.add(3);
s1.add(29);
s1.add(30);
System.out.println("data added successfully");
}
}
