import java.io.*;
import java.util.*;
class albhabets
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
char a=sc.next();
String s=new String("abcdefghijklmnopqrstuvwxyz");
for(int i=0;i<s.length();i++)
{
if(s.contains(a))
{
System.out.print("Albhabets");
}
else
{
System.out.print("No");
}
}
}
}
