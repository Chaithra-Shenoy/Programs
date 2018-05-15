import java.util.Scanner;
public class DoubleOpt
{
public static void main(String[] args)
{
double a,b,c;
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a");
a=sc.nextDouble();
System.out.println("enter b");
b=sc.nextDouble();
System.out.println("enter c");
c=sc.nextDouble();
}
double res=a+b*c;
System.out.println("First output is - "+res);
double res1=a*b+c;
System.out.println("Second output is - "+res1);
double res2=c+a/b;
System.out.println("Third output is - "+res2);
double res3=a%b+c;
System.out.println("Forth output is - "+res3);
}
}

