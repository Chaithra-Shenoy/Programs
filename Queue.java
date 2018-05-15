class Queue
{
static int head=-1,rear=-1,size;
static int count=5;
static int[] a=new int[count];
public static void enqueue(int data)
{
if(rear==count-1)
{
System.out.println("Cannot add elements into queue");
return;
}
if(head==-1&&rear==-1){
head++;
}
a[++rear]=data;
System.out.println("Added element"+data);
}
public static int dequeue()
{
if(head==-1)
{
System.out.println("Cannot remove elements from queue");
return -1;
}
int x=a[head];
head++;
System.out.println("element removed "+" "+head+" "+"is"+" "+x);
return x;
}
static int peek()
{
if(head==-1)
{
System.out.println("queue is empty");
return -1;
}
System.out.println("the first element is"+a[head]);
return a[head];
}

public static void main(String[] args)
{
enqueue(50);
enqueue(80);
enqueue(10);
peek();
enqueue(20);
dequeue();
peek();
}
}

