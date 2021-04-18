package modulo4;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Lancio_dadi_casa {

	public static void main(String[] args) {	
		
		String puntata;
		int portafoglio = 1000;
		int valPuntata,risultato;
		int dado1;   // numero del primo dado.
        int dado2;   // numero del secondo dado.
        int tiro;   // il totale dei 2 tiri (somma dei due).
        
        dado1 = (int)(Math.random()*6) + 1;
        dado2 = (int)(Math.random()*6) + 1;
        tiro = dado1 + dado2;
        
               
        System.out.println("il primo dado da come numero " + dado1);
        System.out.println("il secondo dado da come numero " + dado2);
        System.out.println("il totale dei tiri è  " + tiro);
        
        //fine tiro dei dadi
       
		while ((portafoglio > 10)&&(portafoglio < 5000)) {
			
		//inizio gestione del portafoglio	
			puntata = JOptionPane.showInputDialog("portafoglio = " + portafoglio + "euro\n la tua puntata");
			valPuntata = Integer.parseInt(puntata);
			
			JOptionPane.showMessageDialog(null, "Hai puntato = " + valPuntata + "euro\n portafoglio attuale "+ (portafoglio-valPuntata)
					+ "euro\n digita ok per lanciare i dadi ");
			
			risultato = tiro;
			
			//inizio lista premi
			if (risultato == 2 || risultato == 12) {
				JOptionPane.showMessageDialog(null, "Valore dadi= " + risultato + "hai vinto questo lancio!" + "\nVinto =" + (valPuntata * 4));
			}
			if (risultato == 3 || risultato == 11) {
				JOptionPane.showMessageDialog(null, "Valore dadi= " + risultato + "hai vinto questo lancio!" + "\nVinto =" + (portafoglio +  (valPuntata *2)));
			}
			if (risultato == 4 || risultato == 10) {
				JOptionPane.showMessageDialog(null, "Valore dadi= " + risultato + "hai vinto questo lancio!" + "\nVinto =" + (valPuntata * 2));
			}
			if (risultato == 2 || risultato == 12) {
				JOptionPane.showMessageDialog(null, "Valore dadi= " + risultato + "hai vinto questo lancio!" + "\nVinto =" + (valPuntata ));
			}
			else {
				JOptionPane.showMessageDialog(null, "hai perso questo tiro"+"\nperdi" + valPuntata +"euro");
				System.exit(0);
			}//fine plista premi
				
		
        	
        }

    }  // fine main()
 
}  

