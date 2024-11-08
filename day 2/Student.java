import java.util.Scanner;
class Student
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int sno,maths,os,ds,total;
String sname;
float savg;
System.out.println("enter student number:");
sno=s.nextInt();
System.out.println("enter student name:");
sname=s.next();
System.out.println("enter maths marks:");
maths=s.nextInt();
System.out.println("enter os marks:");
os=s.nextInt();
System.out.println("enter ds marks:");
ds=s.nextInt();
total=maths+os+ds;
savg=total/3;
 System.out.println("student number is:"+sno);
 System.out.println("student name is:"+sname);
 System.out.println(" marks scored in maths:"+maths);
 System.out.println(" marks scored in os:"+os);
 System.out.println(" marks scored in ds:"+ds);
 System.out.println("total marks:"+total);
 System.out.println("average of marks:"+savg);
}
}

 

