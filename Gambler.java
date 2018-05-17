/*Gambler
a. Desc ­> Simulates a gambler who start with $stake and place fair $1 bets until
he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
times he/she wins and the number of bets he/she makes. Run the experiment N
times, averages the results, and prints them out.
b. I/P ­> $Stake, $Goal and Number of times
c. Logic ­> Play till the gambler is broke or has won
d. O/P ­> Print Number of Wins and Percentage of Win and Loss.*/
import java.util.*;
public class Gambler
{
public static void main(String[] args)
{
int stake,goal,num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the stake value:");
stake=sc.nextInt();
System.out.println("Enter the goal value:");
goal=sc.nextInt();
System.out.println("Enter the number of times of bets:");
num=sc.nextInt();
int bets=0,wins=0;
for(int i=0;i<num;i++)
{
int cash=stake;
while(cash>0&&cash<goal)
{
bets++;
if(Math.random()<0.5)
cash++;
else
cash--;
}
if(cash==goal)
wins++;
}
System.out.println("number of wins is"+wins);
System.out.println("Percentage of game won"+" "+" "+(wins*100/num));
//System.out.println("Percentage of game lost"+" "+" "+(100-c));
System.out.println("Average bets:"+" "+bets/num);
}
}

