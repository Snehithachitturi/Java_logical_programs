import java.util.Scanner;
class ArraySum
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sum=0,i;
System.out.println("enter number of array values");
int n=s.nextInt();

int a[]=new int[n];

System.out.println("enter array values");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println(" sum of an array:");
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}