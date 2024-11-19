import java.util.*;
class Tokens
{
public static void main(String[]args)
{
String st1="Hai Hello Welcome to java programming";
StringTokenizer t=new StringTokenizer(st1);
System.out.println("The no of tokens available in given string is:"+t.countTokens());
while(t.hasMoreTokens())
{
System.out.println(t.nextToken());
}
}
}