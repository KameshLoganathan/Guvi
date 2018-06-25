import java.io.*;
import java.util.*;
class hoursub
{
public staic void main(String x[])
{
Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
int t1=sc.nextInt();
int t3=t-t1;
int hours=t3/60;
int minutes=t3%60;
System.out.print(hours+""+minutes);
}
}
