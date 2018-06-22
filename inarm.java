import java.io.*;
import java.util.*;
class arm
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int n1=sc.nextInt();
int c=0; 
int temp=n;
for(i=n;i<=n1;i++)
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
