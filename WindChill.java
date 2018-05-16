/*Write a program WindChill.java that takes two double command­line arguments t
and v and prints the wind chill. Use Math.pow(a, b) to compute ab.
Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to
be: w=35.74+0.6215t+(0.4275t-35.75)v^0.16      t!>50*/
public class WindChill
{
public static void main(String[] args)
{
System.out.println("t is"+args[0]);
System.out.println("v is"+args[1]);
double t=Double.parseDouble(args[0]);
double v=Double.parseDouble(args[1]);
if(t>50 || v<3||v>120)
{
System.out.println("Invalid data");
}
else
{
double a=Math.pow(v,0.16);
double w=35.74+0.6215*t+(0.4275*t-35.75)*a;
System.out.println("temperature is"+w);
}
}
}




