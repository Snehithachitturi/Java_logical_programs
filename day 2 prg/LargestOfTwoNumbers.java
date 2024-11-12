import java.util.*;
class LargestOfTwoNumbers
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter a value");
a=sc.nextInt();
System.out.println("enter b value");
b=sc.nextInt();
if(a>b)
{
System.out.println("a is maximum value:"+a);
}
else
{
System.out.println("b is maximum value:"+b);
}
}
}
