import java.io.*;
import java.util.*;
class spc
{
public static void main(String x[])
{
Scanner sc=newe Scanner(System.in);
String s=sc.next();
int c=0
for(int i=0;i<s.length();i++)
{
if(Character.isLetter(s.charAt(i)) || Character.isDIgit(s.charAt(i)))
{}
else
{
c=c+1;
}
}
System.out.print(c);
}
}
