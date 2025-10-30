package factorielle;

import java.util.Scanner;

public class Factorielle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("Choisissez le nombre sur lequel mettre en place la notion de factorielle");
        int number = scanner.nextInt();
		
		int result = factorielle(number);	
		System.out.println(result);
	}
	
	
	public static int factorielle(int n) {
		int factorielle = 1;
		
		if(n == 0) {
			return 1;
		}
		else {
			 for (int i = 1; i <= n; i++) {
				 factorielle = factorielle * i;
			 }
		}
		
		return factorielle;
	}

}
