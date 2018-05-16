/*Write a program SumOfTwoDice.java that prints the sum of two random integers
between 1 and 6 (such as you might get when rolling dice).*/
import java.util.Random;
public class SumOfTwoDice
{
public static void main(String[] args)
{
Random r=new Random();
int dice1=r.nextInt(7);
int dice2=r.nextInt(7);
System.out.println("Dice1 is -"+dice1);
System.out.println("Dice2 is -"+dice2);
int sum=dice1+dice2;
System.out.println(" sum of two dice is"+sum);
}
}
