import java.io.*;
import java.util.*;
class largesmall
{
public static void main(String x[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
Arrays.sort(a);
System.out.print(a[0]+" "+a[a.length-1]);
}
}
