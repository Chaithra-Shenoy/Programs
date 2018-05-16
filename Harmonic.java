/*Harmonic Number
a. Desc ­> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
b. I/P ­> The Harmonic Value N. Ensure N != 0
c. Logic ­> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P ­> Print the Nth Harmonic Value.*/
import java.util.Scanner;
public class Harmonic
{
public static void main(String[] args)
{
int n;
double res=0;
System.out.println("Enter the value of n");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n<0)
System.out.println("Invalid!!!!");
for(double i=1;i<=n;i++)
{
res=(1/i)+res;
}
System.out.println("Nth harmonic value"+res);
}
}
