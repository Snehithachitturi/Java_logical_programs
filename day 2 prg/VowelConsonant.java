import java.util.Scanner;
class AlphaNumSpl
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the values:");
char ch=sc.next().charAt(0);
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
System.out.println("This is a alphabet");
}
else if(ch>='0'&&ch<='9')
{
System.out.println("This is a number");
}
else
{
System.out.println("This is a special constant");
}
}
}