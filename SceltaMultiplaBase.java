package modulo4;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SceltaMultiplaBase {

	public static void main(String[] args) {
		
		String a,b,c,scelta;
		int valA, valB,valC, valScelta, modulo;
		double risultato;
		String output="";
		DecimalFormat zeroCifre= new DecimalFormat("0");
		
		a=JOptionPane.showInputDialog("Inserisci il primo numero intero [0..[");
		valA=Integer.parseInt(a);
		b=JOptionPane.showInputDialog("Inserisci il secondo numero intero [0..[");
		valB=Integer.parseInt(b);
		
		//controllo di range su valScelta
		do {
			scelta=JOptionPane.showInputDialog("Inserisci un numero intero tra 1 e 5");
			valScelta=Integer.parseInt(scelta);
			
			if((valScelta<1)||(valScelta>5))
				JOptionPane.showMessageDialog(null,"Inserire un numero intero compreso tra 0 e 5",
						"Inserimento errato", JOptionPane.ERROR_MESSAGE);
		
		} while((valScelta<1)||(valScelta>5));
		
		switch(valScelta) {
			
			case 1: //somma
				risultato= valA+valB;
				output="Somma = " +zeroCifre.format(risultato);
				break;
			case 2: //divisione 
				modulo=valA%valB;
				if(modulo==0)
					risultato=valA/valB;
				else
					risultato=(valA-modulo)/valB;
				output="Parte intera divisione = " +zeroCifre.format(risultato) +"\nModulo = " +modulo;
				break;	
			case 3: //potenza
				risultato= Math.pow((double)valA,(double)valB);
				output="Potenza = " +zeroCifre.format(risultato);
				break;
			case 4: //valore max
				c=JOptionPane.showInputDialog("Inserisci il terzo numero intero [0..[");
				valC=Integer.parseInt(c);
				risultato=Math.max((double)valA,(double)valB);
				risultato=Math.max(risultato,(double)valC);
				output="Valore massimo = " +zeroCifre.format(risultato);
				break;
			case 5: //mcd
				do {
					if(valA>valB)
						valA=valA-valB;
					else
						valB=valB-valA;				
				}while(valB!=0);
				risultato=valA;
				output="Massimo comun divisore = " +zeroCifre.format(risultato);
				break;
		}//end switch
		
		JOptionPane.showMessageDialog(null, output);
	}//end main()
}//class
