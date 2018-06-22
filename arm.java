import java.io.*;
import java.util.*;
class arm
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0; 
int temp=n;
while(n>0)
{
a=n%10;  
n=n/10;  
c=c+(a*a*a);
}
if(temp==c)
System.out.print("Yes");
else
System.out.print("No");
}
}
