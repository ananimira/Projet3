package samira.anani;
import java.util.*;

public class NombrePremier {
	public static void  main(String args[]) { 
		int resultat= NombrePremier();		
		
	}
	
	public static int NombrePremier() {
		int nombre;
		System.out.println("entrer un nombre entier ");
		Scanner saisir = new Scanner(System.in);
		nombre= saisir.nextInt();
		int n = nombre;
		
	boolean premier = estPremier(n);
	if(premier) {
		
		System.out.println(" le nombre " +nombre+  " est premier " );
	} else { System.out.println(" le nombre "+nombre+"  n'est pas premier");}
		
		return nombre;
		
	}
		
		public static  boolean estPremier(int n) {
		    if (n <= 1) {
		        return false;
		    }
		    if (n == 2 || n == 3) {
		        return true;
		    }
		    if (n % 2 == 0 || n % 3 == 0) {
		        return false;
		    }
		    int i = 5;
		    while (i * i <= n) {
		        if (n % i == 0 || n % (i + 2) == 0) {
		            return false;
		        }
		        i += 6;
		    }
		    return true;
		
	}
	
	

}
