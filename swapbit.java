import java.io.*;
import java.util.*;
class swap
{
public static void main(String x[])
{
Scanner sc=new Scannner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
a=a^b;;
b=a^b;
a=a^b;
System.out.print(a+""+b);
}
}
