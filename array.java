import java.io.*;
import java.util.*;
class array
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int sum=0;
int a[]=new int[a];
for(int i=0;i<a;i++)
{
a[i]=sc.nextInt();
}
for(int j=0;j<b;j++)
{
sum=sum+a[j];
}
System.out.print(sum);
}
}
