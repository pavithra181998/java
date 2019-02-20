import java.util.Scanner;

 class Length
{
   public static void main(String args[])
   {
      String str;
      int len;
      Scanner scan = new Scanner(System.in);
	  
      System.out.print("Enter Your Name : ");
      str = scan.nextLine();
      len = str.length();
	  
      System.out.print("Length of Entered String is " + len);
   }
}