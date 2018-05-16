/*Write a program SpringSeason.java that takes two int values m and d from the
command line and prints true if day d of month m is between March 20 (m = 3, d
=20) and June 20 (m = 6, d = 20), false otherwise.*/

import java.util.Scanner;
public class SpringSeason
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int d=sc.nextInt();



if(m<1&&m>12)
{
System.out.println("not spring season");
}
if(d<1&&d>31)
{
System.out.println("not spring season");
}
if((m==3&&d>=20))
{
System.out.println("Spring season");
}
else if(m==3&&d<20)
{
    System.out.println("not spring season");
}
if(m==6&&d<=20)
{
System.out.println("Spring season");
}
else if(m==6&&d>20)
{
    System.out.println("not spring season");
}

if((m==4 ||m==5)&&d>=1)
{
System.out.println("Spring season--2");
}


}
}

