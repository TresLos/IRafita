package src.proves;

import src.Communicacio.simplon;

public class soloControl
{
	public static void main (String [] argts)
	{
		simplon lola = new simplon ();
		System.out.println ("\nequacio.provaSimple1.t");
		lola.testejarCodi ("equacio.provaSimple1.t");
		System.out.println ("\nerrorBuit.txt");
		lola.testejarCodi ("errorBuit.txt");
		System.out.println ("\nerrorFaltaSegonaPart");
		lola.testejarCodi ("errorFaltaSegonaPart.txt");
		System.out.println ("\nErrorNoExisteix");
		lola.testejarCodi ("Muhahahha");
//		controlEntrada ctrlE = new controlEntrada ("equacio.provaSimple1.t");
//		controlEntrada ctrlError = new controlEntrada ("equdfacio.provaSimple1.t");
	}
}
