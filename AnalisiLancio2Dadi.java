package modulo4;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AnalisiLancio2Dadi {

	public static void main(String args[]) {
		
		final int LANCI_TOTALI = 500;
		
		int frequenza2 = 0, frequenza3 = 0, frequenza4 = 0,
			frequenza5 = 0, frequenza6 = 0, frequenza7 = 0,
			frequenza8 = 0, frequenza9 = 0, frequenza10 = 0,
			frequenza11 = 0, frequenza12 = 0;
		
		int risultato;
		String output = "Lanci totali = " +LANCI_TOTALI
				       +"\n\nFaccia\tFrequenza";
		
		JTextArea outputArea = new JTextArea();
		
		for(int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			
			risultato = lancia2Dadi();
			
			switch(risultato) {
				case 2:
					frequenza2++;
					break;
				case 3:
					frequenza3++;
					break;
				case 4:
					frequenza4++;
					break;
				case 5:
					frequenza5++;
					break;
				case 6:
					frequenza6++;
					break;
				case 7:
					frequenza7++;
					break;
				case 8:
					frequenza8++;
					break;
				case 9:
					frequenza9++;
					break;
				case 10:
					frequenza10++;
					break;
				case 11:
					frequenza11++;
					break;
				case 12:
					frequenza12++;
					break;
			} //fine switch(faccia)
			
		} //fine ciclo for(int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
		
		output += "\n2\t" +frequenza2 +"\n3\t" +frequenza3 +"\n4\t" +frequenza4 
				 +"\n5\t" +frequenza5 +"\n6\t" +frequenza6 +"\n7\t" +frequenza7
				 +"\n8\t" +frequenza8 +"\n9\t" +frequenza9 +"\n10\t" +frequenza10 
				 +"\n11\t" +frequenza11 +"\n12\t" +frequenza12;
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);
		
	} //fine metodo main()
	
	public static int lancia2Dadi() {
		
		int dado1, dado2, sommaDadi;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		
		sommaDadi = dado1 + dado2;
		
		return sommaDadi;
		
	} //fine metodo lanciaDado()
	
} //fine classe
