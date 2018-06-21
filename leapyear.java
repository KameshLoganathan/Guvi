import java.io.*;
import java.util.*;
class leapyear
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int year=sc.nextInt();
if((year%400==0 || year%100!=0) &&(year%4==0))
    System.out.print("It is a leap year");
else
    System.out.print("It is not a leap year");
    }
}
