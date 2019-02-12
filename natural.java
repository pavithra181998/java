 import java.util.*;
   import java.util.Scanner;   
    public class natural
{
    public static void main(String args[])
    {
        int x, i = 1 ;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("");
        
        x = s.nextInt();
        while(i <= x)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(+sum);
    } 

  
}