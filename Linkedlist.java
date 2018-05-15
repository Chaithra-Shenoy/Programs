
class Linkedlist 
{
private class Node
{
Object data;
Node link;
public Node(Object data) {
this.data=data;
}
}
private Node head = null;
private int size;
public void add(Object arg)
{
Node n = new Node(arg);
if(head==null)
{
head=n;
size++;
System.out.println("head element added"+arg);
return;
}
Node t = head;
while(t.link!=null)
{
t=t.link;
}
t.link=n;
size++;
System.out.println("element added successfully"+arg);
}
public void addFirst(Object data)
{
Node n = new Node(data);
n.link = head;
head = n;
size++;
System.out.println(" "+"head element added at first"+data);
}
public void display()
{
Node t = head;
while(t!=null)
{
System.out.print(t.data+"-> ");
t =t.link;
}
System.out.println();
}
public void insert(int index, Object data)
{
if(index ==0)
{
addFirst(data);
return;
}
Node n1 = new Node(data);
Node t = head;
int count = 0;
while(count <index -1)
{
t = t.link;
count++;
}
n1.link = t.link;
t.link = n1;
size++;
}
public void reverse(Node start)
{
if(start.link!=null)
reverse(start.link);
System.out.print(start.data+" <-");
}
public void reverse() {
reverse(head);
System.out.println();
}
public int size()
{
return size;
}
public boolean isEmpty()
{
return head==null;
}
public Object remove(int index)
{
if(index == 0)
{
Object data = head.data;
head = head.link;
return data;
}
int count = 0;
Node t = head;
while(count<index-1)
{
t = t.link;
count++;
}
Object data = t.link.data;
t.link = t.link.link;
return data;
}
public static void main(String[] args)
{
System.out.println("linked list");
Linkedlist l1=new Linkedlist();
l1.add(10);
l1.isEmpty();
l1.display();
l1.insert(1,13);
l1.display();
l1.insert(2,22);
l1.addFirst(56);
l1.display();
l1.remove(3);
l1.display();

System.out.println("completed");
}
}

