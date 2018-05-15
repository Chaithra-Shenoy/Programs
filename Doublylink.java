public class DoublyLink
{
private class DNode
{
Object data;
DNode next;
DNode prev;
public DNode(Object data)
{
this.data = data;
}
}
private DNode head = null;
private DNode tail = null;
private int size = 0;
public void add(Object data)
{
DNode d = new DNode(data);
if(head==null && tail == null)
{
head = d;
tail = d;
size++;
}
DNode t = tail;
while(t.next!=null)
{
t = t.next;
}
tail = d;
t.next = tail;
tail.prev = t;
size++;
}

public void addFirst(Object data)
{
DNode d = new DNode(data);
d.next = head;
head.prev = d;
head = d;
size++;
}
public void insert(int index, Object data)
{
if(index ==0)
{
addFirst(data);
return;
}
if(index == size-1)
{
add(data);
return;
}
DNode d1 = new DNode(data);
}
public void display()
{
DNode t = head;
while(t!=null)
{
System.out.print(t.data+"-> ");
t = t.next;
}
System.out.println();
}
public void reverse()
{
DNode t = tail;
while(t!= null)
{
System.out.print(t.data+" <-");
t = t.prev;
}
System.out.println();
}
public Object remove(int index)
{
Object data = null;
if(index ==0)
{
data = head.data;
head = head.next;
head.prev = null;
size--;
return data;
}
if(index == size-1)
{
data = tail.data;
tail = tail.prev;
tail.next = null;
size--;
return data;
}
DNode t=null;
if(index<size/2)
{
t =head;
int lcount = 0;
while(lcount<index-1)
{
t = t.next;
lcount++;
}
data = t.next.data;
t.next.next.prev = t.next.prev;
t.next = t.next.next;
size--;
return data;
}
t = tail;
int rcount = size-1;
while(rcount>index+1)
{
t = t.prev;
rcount--;
}
data = t.prev.data;
t.prev.prev.next = t.prev.next;
t.prev = t.prev.prev;
size--;
return data;
}
public int size()
{
return size;
}
public Object getHead()
{
return head.data;
}
public Object getTail()
{
return tail.data;
}
public static void main(String[] args)
{
System.out.println("Doubly linked list");
DoublyLink d1=new DoublyLink();
d1.add(10);
d1.add(100);
d1.add(1000);
d1.add(10000);
d1.display();
d1.addFirst(01);
d1.display();
d1.add(100000);
d1.display();
d1.remove(6);
d1.display();
}
}




