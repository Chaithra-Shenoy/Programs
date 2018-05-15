public class Stack
{
static int cp=4;
static int top;
static int[] a=new int[cp];
public static boolean isEmpty()
{
if(top==-1)
{
System.out.println("Stack is empty");
return true;
}

return false;
}
public static void push(int data)
{
if(top==cp-1)
{
System.out.println("Stack overflow");
}
top++; 
System.out.println(a[top]=data);
}
public static int pop()
{
if(top==-1)
{
System.out.println("Stack is empty");
return -1;
}
int x=a[top--];
System.out.println("popped element is"+x);
return x;
}
public static int peek()
{
if(top==-1)
{
System.out.println("Stack is empty");
return -1;
}
System.out.println("element is"+a[top]);
return a[top];
}
public static void main(String[] args)
{
System.out.println("Stack is empty");
push(10);
push(20);
push(30);
push(50);
push(40);
pop();
peek();
isEmpty();
}
}
