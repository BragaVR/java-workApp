package modulo4;
import javax.swing.JOptionPane;

public class TestaOCroce {

	public static void main(String[] args) {
		
		int budget = 100;
		String puntata, scommessa;
		int valPuntata, valScommessa, risultato;
		
		while((budget>0)&&(budget<1000)) {
			
			JOptionPane.showMessageDialog(null, "Budget = " +budget +" euro");
			
			puntata = JOptionPane.showInputDialog("Inserisci puntata (euro)");
			valPuntata = Integer.parseInt(puntata);
			
			budget -= valPuntata;
			
			JOptionPane.showMessageDialog(null, "Budget = " +budget +" euro");
			
			scommessa = JOptionPane.showInputDialog("Inserisci scommessa"
					+"\n[1] Testa\n[2]Croce");
			valScommessa = Integer.parseInt(scommessa);
			
			risultato = lanciaMoneta();
			
			if(risultato == valScommessa) {
				JOptionPane.showMessageDialog(null, "Hai vinto la mano"
						+"\nVinci " +valPuntata*2 +" euro");
				budget += valPuntata*2;
			} //fine if(risultato == scommessa)
			else
				JOptionPane.showMessageDialog(null, "Hai perso la mano"
						+"\nPerdi " +valPuntata +" euro");
				
		} //fine ciclo while((budget>0)&&(budget<1000))
		
		if(budget >= 1000)
			JOptionPane.showMessageDialog(null, "Complimenti, hai vinto!!!");
		else
			JOptionPane.showMessageDialog(null, "Hai Perso :-(");
		System.exit(0);
			
	} //fine metodo main()/////////////////////////////////////////////////////
	
	public static int lanciaMoneta() {
		
		int esitoLancio;
		
		esitoLancio = 1+(int)(Math.random()*2);
		return esitoLancio;
		
	} //fine metodo lanciaMoneta()/////////////////////////////////////////////

} //fine classe TestaOCroce
