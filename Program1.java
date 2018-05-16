/*User Input and Replace String Template “Hello <<UserName>>, How are you?”
a. I/P ­> Take User Name as Input. Ensure UserName has min 3 char
b. Logic ­> Replace <<UserName>> with the proper name
c. O/P ­> Print the String with User Name*/
import java.util.Scanner;
public class Program1
{
public static void main(String[] args)
{
System.out.println("Enter username");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char[] ch=s.toCharArray();
if(ch.length<3)
System.out.println("Username must be greater than 3");
else
System.out.println("Hello"+" "+s+", "+"How are you?");
}
}
