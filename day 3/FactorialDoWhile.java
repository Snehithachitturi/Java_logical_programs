import java.util.Scanner;
class FactorialDoWhile
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=1,n,f=1;
System.out.println("enter a value");
n=s.nextInt();
do
{
f=f*i;
i++;
}while(i<=n);
System.out.println("the factorial of"+n+" natural numbers"+f);
}
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=1,n,f=1;
System.out.println("enter a value");
n=s.nextInt();
do
{
f=f*i;
i++;
}while(i<=n);
System.out.println("the factorial of"+n+" natural numbers"+f);
}
}