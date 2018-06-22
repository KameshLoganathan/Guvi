import java.io.*;
import java.util.*;
class pali
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer sb=new StringBuffer(s);
String s1=new String(sb.reverse());
if(s.equals(s1))
System.out.print("Yes"):
else
System.out.print("No");
}
}
