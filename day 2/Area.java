import java.util.Scanner;
class Area
{
public static void main(String args[])
{
 Scanner A=new Scanner(System.in);
 int radius;
 float pi=3.14f;
 float area;
 System.out.println("enter radius of circle");
 radius=A.nextInt();
 System.out.println("enter pi:"+pi);
 area=pi*radius*radius;
 System.out.println("area of circle is:"+area);
}
}