import java.io.*;
import javautil.*;
calss proset1p2
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String s1="";
int n=sc.nextInt():
for(int i=0;i<s.length();i++)
{
if(Character.getNumericValue(s.charAt(i))==n)
s1=s.substring(i,s.length()-1);
}
for(int j=0;j<s1.length();j++)
{
if(s1.charAt(j)==s1.charAt(j+1))
StringBuh=ffer sb=new StringBuffer(s);
sb.delete(j+1);
}
System.out.print(sb);
}
}
