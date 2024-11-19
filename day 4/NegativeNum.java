import java.util.Scanner;
class NegativeNum
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the Array limit:");
int a=input.nextInt();
int[]b=new int[a];
for(int i=0;i<1;i++)
{
System.out.println("Elements of b[%d]:",i);
b[i]=input.nextInt();
}
System.out.println("/n Negative Array Elements/n");
for(int n:a)
{
if(n<0)
System.out.println(n);
}
}
}