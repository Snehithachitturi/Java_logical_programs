import java.util.Scanner;
class Employee
{
public static void main(String args[])
{
Scanner e= new Scanner(System.in);
int eno;
String ename;
float esal;
System.out.println("enter employee number:");
eno=e.nextInt();
System.out.println("enter employee name:");
ename=e.next();
System.out.println("enter employee salary:");
esal=e.nextFloat();
System.out.println("the given employee number is:"+eno);
System.out.println("the given employee name is:"+ename);
System.out.println("the given employee salary is:"+esal);
}
}
