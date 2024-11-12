import java.util.*;
class UnitCharges
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the electricity unit:");
int unit=sc.nextInt();
float amt,surcharge,bill amt;
if(unit<=50)
{
amt=unit*0.50f;
}
elseif(unit<=150)
{
amt=unit*0.75f;
}
elseif(unit<=250)
{
amt=unit*1.20f;
}
else
{
amt=unit*1.50f;
}
surcharge=amt*0.2f;
bill amount=amt+surcharge;
System.out.println("Total electricity bill:"+bill amt);
}
}