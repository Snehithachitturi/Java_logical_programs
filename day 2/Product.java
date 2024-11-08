import java.util.Scanner;
class Product
{
public static void main(String args[])
{
 Scanner pdt=new Scanner(System.in);
 int pdtno;
 String pdtname;
 int pdtcost;
 float pdtquantity;
 float Bill;
 System.out.println("enter the product number");
 pdtno=pdt.nextInt();
 System.out.println("enter the product name");
 pdtname=pdt.next();
 System.out.println("enter the product cost");
 pdtcost=pdt.nextInt();
 System.out.println("enter the product quantity");
 pdtquantity=pdt.nextFloat();
 Bill=pdtcost*pdtquantity;
 System.out.println("total bill is:"+Bill);
 System.out.println("product number  is:"+pdtno);
 System.out.println(" product name is:"+pdtname);
 System.out.println("product cost is:"+pdtcost);
 System.out.println("How many "+pdtname+" we want:"+pdtquantity);
}
}


 


 

 
 
 