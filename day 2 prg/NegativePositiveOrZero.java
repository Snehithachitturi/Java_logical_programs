import java.util.*;
class NegativePositiveOrZero
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter the value of a:");
a=sc.nextInt();
if(a>0)
{
System.out.println("a is positive number:"+a);
}
else if(a<0)
{
System.out.println("a is negative number:"+a);
}
else
{
System.out.println("a is equal to zero:"+a);
}
}
}