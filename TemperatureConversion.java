/*Write a TemperaturConversion.java program, given the temperature in fahrenheit
as input outputs the temperature in Celsius or viceversa using the formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C*/
import java.util.Scanner;
public class TemperatureConversion
{
public static void celToFah(double val)
{
double res=(val*(double)(9/5))+32;
System.out.println("Fahrenheit value is"+res);
}
public static void fahToCel(double val)
{
double res1=(val-32)*(0.5556);
System.out.println("Celsius value is"+res1);
}
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
double m=sc.nextDouble();
double n=sc.nextDouble();
celToFah(m);
fahToCel(n);
}
}
