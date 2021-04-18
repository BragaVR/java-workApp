package progetti;

import java.util.Scanner;

public class Registrazione_App {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		String name ="BragaSoft";
		String password = "12345";
		int pass = 3;               // gli errori di inserimento massimi consentiti
		
		
		while (true) {
			
			System.out.println("inserisci il tuo nome :");
			String nameInput = scan.nextLine();
			System.out.println("perfavore inserisci la tua password");
			String passwordInput = scan.nextLine();									
			
			if(name.equals(nameInput)&&password.equals(passwordInput)) {
				
				System.out.println("hai scritto nome e password correttamente");
				System.out.println("Benvenuto nell'app di registrazione");
				break;
			} 
			else if (!name.equals(nameInput) &! password.equals(passwordInput)){
				
				System.out.println("il nome inserito non è corretto");
				pass -= 1 ; // un tentativo su 3 in meno
				System.out.println("ti rimangono ==" + pass + "tentativi");
				
			} else if (name.equals(nameInput) && !password.equals(passwordInput)) {
				
				System.out.println("la password inserita non è corretta");
				pass -= 1; // un tentativo su 3 in meno
				System.out.println("ti rimangono ==" + pass + "tentativi");
			}
			
			else if (!(name.equals(nameInput)) && !(password.equals(passwordInput))) {
				System.out.println("nome e password sbagliati, riprova");
				pass -=1;   // un tentativo su 3 in meno
				System.out.println("ti rimangono ==" + pass + "tentativi");
			}
			
			if (pass == 0) {
				System.out.println("hai esaurito i tentativi di inserimento ");
				break;
				
			}
		}
		
		
	   

	}

}
