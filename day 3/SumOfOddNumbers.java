import java.util.Scanner;
public class SumOfOddNumbers 
{
public static void main(String[] args) 
{
int number, i, oddSum = 0;
Scanner sc = new Scanner(System.in);		
System.out.print(" Please Enter any Number : ");
number = sc.nextInt();			
for(i = 1; i <= number; i++)
{
if(i % 2 != 0)
{
oddSum = oddSum + i; 
}
System.out.println(" The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
}
}
}
{
public static void main(String[] args) 
{
int number, i, oddSum = 0;
Scanner sc = new Scanner(System.in);		
System.out.print(" Please Enter any Number : ");
number = sc.nextInt();			
for(i = 1; i <= number; i++)
{
if(i % 2 != 0)
{
oddSum = oddSum + i; 
}
System.out.println(" The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
}
}
}