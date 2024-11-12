import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i=1,n,f=1;
System.out.println("enter a value");
n=s.nextInt();
while(i<=n)
{
f=f*i;
i++;
}
System.out.println("the factorial of"+n+" natural numbers"+f);
}
}