/*Factors
a. Desc ­> Computes the prime factorization of N using brute force.
b. I/P ­> Number to find the prime factors
c. Logic ­> Traverse till i*i <= N instead of i <= N for efficiency.
d. O/P ­> Print the prime factors of number N.*/
import java.util.Scanner;
public class Factors
{
public static void primeFactor(int num)
{
 while (num%2==0)
        {
            System.out.println(2);
            num /= 2;
        }
for (int i = 3; i*i <=num; i+= 2)
        {
while (num%i == 0)
            {
                System.out.println(i);
                num /= i;
            }
        }
          if (num > 2)
           System.out.println(num);
    }
  
 public static void main(String[] args)
{
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Pime factors are:");
primeFactor(n);
}
}

