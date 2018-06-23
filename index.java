import java.io.*;
import java.util.*;
class index
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
System.out.print(a[i]+""+i);
}
}
}
