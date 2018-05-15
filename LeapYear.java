import java.util.Scanner;
public class LeapYear
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
int year=sc.nextInt();
boolean flag=false;
if(year<1582)
{
System.out.println("the year should be grater than 1582");
}

 
else if (year%400==0)
{
flag=true;
}
else if(year%100==0)
{
flag=false;
}
else if(year%4==0)
{
flag=true;
}
else
{
flag=false;
}
if(flag)
{
System.out.println("Given year is leap year --"+year);
}
else
System.out.println("Given year is not leap year --"+year);
}
}

