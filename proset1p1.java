import java.io.*;
import java.util.*;
class proset1p1
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=Integer.parseInt(sc.next());
String s[]=new String[3];
String s1="";
String s2="";
for(int i=0;i<n;i++)
{
s[i]=sc.next();
}
for(int j=0;s[j].length();j++)
{
if(s[i].charAt(i)==s1[i+1].charAt(i))
s1=s.substring(0,i);
if(s2<s1)
s2=s1;
}
}
System.out.print(s2);
}
}
