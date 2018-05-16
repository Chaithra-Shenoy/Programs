/*Write a program Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots. The 2 roots of the equation
can be found using a formula
delta = b*b ­- 4*a*c
Root 1 of x = (­b + sqrt(delta))/(2*a)
Root 2 of x = (­b ­- sqrt(delta))/(2*a)
Take a, b and c as input values to find the roots of x.*/
import java.util.Scanner;
public class Quadratic
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
double delta,root1,root2;
delta=b*b-4*a*c;
root1=(-b+sqrt(delta))/(2*a);
root2=(-b-sqrt(delta))/(2*a);
System.out.println("root1 is "+root1);
System.out.println("root2 is "+root2);
}
public static double sqrt(double x)
{
double a=x*x;
return a;
}
}

