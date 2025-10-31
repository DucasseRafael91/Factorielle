package factorielle;

import java.util.Scanner;

public class Factorielle {
	
	
	
	public static void main(String[] args) {
		/**Methode principale du programmee
		 * @param : none
		 * @return : none
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//Demande le nombre à factoriser (de type Int )
        System.out.println("Choisissez le nombre sur lequel mettre en place la notion de factorielle (Ne fonctionne pas au dessus de 65) ");
        int  number = scan.nextInt();
		
        //Appelle le résultat de la fonction factorielle et le stocke dans la variable result
        String  result = factorielle(number);	
        
        //Affiche le résultat
		System.out.println(result);
	}
	
	
	public static String  factorielle(int  n) {
		/**
		 * @param n : nombre à factoriser
		 * @return factorielle : factorielle du nombre n passé en paramétre
		 */
		
		//Valeur qui va stocker le résultat de la factorielle (type long)
		long  factorielle = 1;
		
		// Gere l'affichage pour montrer le calcul effectué
		String calcul = "";
		
		
		// Verifie que le nombre à lequel applique la notion de factorielle n'est pas 0 ou 1
		if(n == 0 || n == 1){
			return "1";
		}
		else {
			// Boucle pour chaque entier entier au nombre passé en paramétre
			 for (int i = 1; i < n; i++) {
				 factorielle = factorielle * i;
				 calcul = calcul + i + " * ";
			 }
			 factorielle = factorielle * n;
			 calcul +=  n + " = " + factorielle;
		}
		
		//Renvoie une string représentant le calcul effectué
		return calcul;
	}
}
