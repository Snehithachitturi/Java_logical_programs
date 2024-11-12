import java.util.Scanner;
class Array
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i;
System.out.println("enter number of array values");
int n=s.nextInt();

int a[]=new int[n];

System.out.println("enter array values");
for(i=0;i<a.length;i++)
{
a[i]=s.nextInt();
}
System.out.println(" the array elements are:");
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}