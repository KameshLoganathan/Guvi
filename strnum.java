import java.io.*;
import java.util.*;
class strnum
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextInt();
if(s.isNumeric())
{
System.out.print("Yes");
else
System.out.print("No");
}
}
}
