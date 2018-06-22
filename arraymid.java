import java.io.*;
import java.util.*;
class arraymax
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
if(n/2!=0)
System.out.print(n);
}
}
