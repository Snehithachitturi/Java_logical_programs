import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,n;
System.out.println("enter a value");
n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(n+"*"+i+"="+(i*n));
}
}
}