package App;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*
		 * ALGORITHME ex1
		 * VARIABLES
		 * 		utilisateur : chaine de caractere
		 * 
		 * DEBUT 
		 * 		ecrire "Quel est votre pr�nom?"
		 * 		lire utilisateur
		 * 
		 * 		ecrire "Bonjour ,"+utilisateur !
		 * 
		 * FIN
		 * 
		 * 
		*/
		
		String utilisateur ; 
		
		Scanner  clavier  = new Scanner(System.in);
		System.out.println("Quel votre Pr�nom ?");
		utilisateur = clavier.nextLine();
		
		System.out.println("Bonjour,"+utilisateur+"!");
		

	}

}
