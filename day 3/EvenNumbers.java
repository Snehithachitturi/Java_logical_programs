import java.util.*;
class EvenNumbers
{
public static void main(String args[])
{
int n, i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the list of even numbers:");
n=sc.nextInt();
i=2;
System.out.print("List of even numbers:");
while(i<=n)
{
System.out.println(i+" ");
i=i+2;
}
}
}
