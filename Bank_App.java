package progetti;
import java.util.Scanner;
public class Bank_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Benvenuto nel tuo wallet Bank_App");
		System.out.println("Scegli una tra le seguenti operazioni: ");
		System.out.println("Premi 1 per terminare l'applicazione");
		System.out.println("Premi 2 per trasferire denaro");
		System.out.println("Premi 3 per ritirare denaro");
		int operations = sc.nextInt();
		
		if (operations == 1) {
			System.out.println("chiusura dell'applicazione in corso");
		}
		else if (operations == 2) {
			System.out.println("hai scelto trasferimento, puoi trasferire denaro su un altro conto");
			System.out.println("a quanto ammonta il saldo totale?");
			int bilancio = sc.nextInt(); 
			
			System.out.println("quanti soldi vuoi trasferire?");
			int trasferimento = sc.nextInt();
			System.out.println("stiamo trasferendo la cifra da te richiesta di"+(trasferimento) + ("$"));
			System.out.println("il tuo saldo disponibile è di: " + (bilancio-trasferimento));
			System.out.println("Congratulazioni!trasferimento avvenuto con successo!");	
			
			
			if (bilancio < trasferimento) {
				System.out.println("il tuo saldo disponibile è insufficente, l'applicazione verrà chiusa ");
				System.exit(0);				
			}
			
			else if (bilancio > trasferimento || bilancio == trasferimento) { 
				System.out.println(" Hai trasferito  " + trasferimento);
				System.out.println("il saldo rimanente è di : " + (bilancio- trasferimento) + ("$"));
				
			}
		
		}
		
		else if (operations == 3) {
			System.out.println("hai scelto prelievo,ora puoi ritirare direttamente dal tuo wallet");
			System.out.println("a quanto ammonta il saldo totale?");
			int bilancio = sc.nextInt(); 
			System.out.println("quanto vuoi ritirare?");
			int soldi = sc.nextInt();
			System.out.println("erogazione in corso, hai ritirato: " + soldi + (" $"));
			System.out.println("il tuo saldo disponibile è di:  " +(bilancio-soldi) );
			System.out.println("Congratulazioni!prelievo avvenuto con successo!");
			
			if (bilancio < soldi) {
				System.out.println("il tuo saldo disponibile è insufficente, l'applicazione verrà chiusa ");
				System.exit(0);				
			}
			
			else if (bilancio > soldi || bilancio == soldi) { 
				System.out.println(" Hai trasferito  " + soldi);
				System.out.println("il saldo rimanente è di : " + (bilancio- soldi) + ("$"));
				
			}			
			
			
			
		}
		
		else {
			System.out.println("operazione non valida");
			System.exit(0);
		}
		
		System.out.println(" La ringraziamo per aver scelto MyBankApp!");

	}

}
