class Addition
{
int a,b,c;
void add(intx,inty)
{
a=x;
b=y;
c=a+b;
System.out.println("The addition value is:"+c);
}
}
class Argument
{
public static void main(String[]args)
{
int m=67,n=34;
Addition a1=new Addition();
a1.add(m,n);
}
}