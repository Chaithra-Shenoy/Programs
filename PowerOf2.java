/*a. Desc ­> This program takes a command­line argument N and prints a table of the
powers of 2 that are less than or equal to 2^N.
b. I/P ­> The Power Value N. Only works if 0 <= N < 31 since 2^31 overflows an int
c. Logic ­> repeat until i equals N.
d. O/P ­> Print the year is a Leap Year or not.*/
public class PowerOf2
{
public static void main(String[] args)
{
int n;
int res=1;
System.out.println("given value of n is->"+args[0]);
n=Integer.parseInt(args[0]);
for(int i=0;i<=n;i++)
{
res=pow(2,i);
System.out.println("2 ^"+i+"="+res);
}
}
public static int pow(int a,int b)
{
int c=1;
if(b==0)
return 1;
else
while(b>0)
{
 c= c*a;
--b;

}
return c;
}
}
