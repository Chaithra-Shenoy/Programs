/*Flip Coin and print percentage of Heads and Tails
a. I/P ­> The number of times to Flip Coin. Ensure it is positive integer.
b. Logic ­> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
heads
c. O/P ­> Percentage of Head vs Tails*/
import java.util.Scanner;
import java.util.Random;
public class Coin
{
public static void main(String[] args)
{
int i, n;
double head=0.0,tail=0.0;
double hp,tp;
System.out.println("Enter The number of times to Flip Coin");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n<0)
System.out.println("invalid!!!");
double a[]=new double[10];
for(i=0;i<n;i++){
a[i]=Math.random();
if(a[i]<0.5){
tail=tail+a[i];
System.out.println(+tail+"tail");}
else{
head=head+a[i];
System.out.println(+head+"head");
}
System.out.println("number"+a[i]);
}
hp=head*100;
tp=tail*100;
System.out.println("Percentage of head"+hp);
System.out.println("percentage of tail"+tp);
}
}


