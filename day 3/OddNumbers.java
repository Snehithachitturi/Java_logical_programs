import java.util.*;
class OddNumbers
{
public static void main(String args[])
{
int n, i;
Scanner sc=new Scanner(System.in);
System.out.println("enter the list of odd numbers:");
n=sc.nextInt();
i=0;
System.out.print("List of odd numbers:");
while(i<=n)
{
System.out.println(i+" ");
i=i+1;
}
}
}
