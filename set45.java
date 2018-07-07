import java.io.*;
import java.util.*;
class swap
{
public static void main(String x[])
{
Scanner sc=new Scannner(System.in);
String s=sc.next();
int c=0;
for(int i=0;i<s.length();i++)
{
if(Character.isDigit(s.charAt(i)))
{
c=c+1;
}
}
System.out.print(c);
}
}
