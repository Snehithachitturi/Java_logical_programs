import java.util.Scanner;
class WeekName
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int daynum=0;
System.out.println("enter the weekday number:");
day num=sc.nextInt();
switch(daynum)
{
case 0:
System.out.println("Sunday");
break;
case 1:
System.out.println("Monday");
break;
case 2:
System.out.println("Tuesday");
break;
case 3:
System.out.println("Wednesday");
break;
case 4:
System.out.println("Thursday");
break;
case 5:
System.out.println("Friday");
break;
case 6:
System.out.println("Saturday");
break;
default:
System.out.println("Invalid please enter the 0 to 6");
break;
}
}
}