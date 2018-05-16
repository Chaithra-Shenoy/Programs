/*Write a program Stats5.java that prints five uniform random values between 0 and 1,
their average value, and their minimum and maximum value. Use Math.random(),
Math.min(), and Math.max().*/
import java.util.Random;
public class Stats5
{
public static void main(String[] args)
{
double a=0,b=0,c=0,d=0,e=0;
System.out.println("entering 5 uniform random valus");
for(int i=0;i<1;i++)
{
a=Math.random();
b=Math.random();
c=Math.random();
d=Math.random();
e=Math.random();
System.out.println("a is"+" "+a+" "+"b is"+" "+b+" "+"c is"+" "+c+" "+"d is"+" "+d+" "+"e is"+" "+e);
}
System.out.println("min value is"+Math.min(0,1));
System.out.println("max value is"+Math.max(0,1));
double avg=(a+b+c+d+e)/5;
System.out.println("avg value is"+avg);
}
}


