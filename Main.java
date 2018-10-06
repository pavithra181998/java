import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print(" ");
        int a = reader.nextInt();

        if(a>0&&a% 2 == 0)
            System.out.println("even");
       else if(a%2!=0)
            System.out.println("odd");
        else
        System.out.println("invalid");
    }
        
    }
        