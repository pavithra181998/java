import java.util.Scanner;

class Main
{
public static void main(String[] args) 
{
int a,b,c,largest;
Scanner s=new Scanner(System.in);
System.out.println("");
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();

if(a>=b && a>=c) 
{
System.out.println(+a);
}
if(b>=a && b>=c) 
{
System.out.println(+b);
}
if(c>=a && c>=b) 
{
System.out.println(+c);
}
}
}