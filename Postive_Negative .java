import java.util.Scanner;
public class Postive_Negative 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print(" ");
        num = s.nextInt();
        if(num > 0)
        {
            System.out.println("Positive");
        }
        else if(num < 0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Zero");
        }
    }
}
