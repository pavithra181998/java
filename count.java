import java.util.Scanner;

public class count {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Count=0;
		sc = new Scanner(System.in);		
		System.out.println("");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.println(+Count);
	}
}