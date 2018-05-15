import java.util.Scanner;
public class IntOpt
{
public static void main(String[] args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
a=sc.nextInt();
System.out.println("enter b");
b=sc.nextInt();
System.out.println("enter c");
c=sc.nextInt();

int res=a+b*c;
System.out.println("First output is - "+res);
int res1=a*b+c;
System.out.println("Second output is - "+res1);
int res2=c+a/b;
System.out.println("Third output is - "+res2);
int res3=a%b+c;
System.out.println("Forth output is - "+res3);
}
}


