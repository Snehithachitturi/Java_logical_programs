import java.util.*;
class MaximumOfThreeNumbers
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
System.out.println("enter c value");
c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println("a is maximum number:"+a);
}
else if(b>a&&b>c)
{
System.out.println("b is maximum number:"+b);
}
else
{
System.out.println("c is maximum number:"+c);
}
}
}