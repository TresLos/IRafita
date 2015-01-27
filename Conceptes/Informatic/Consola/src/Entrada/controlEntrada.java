package src.Entrada;

import src.Entrada.entradaFile;

import src.Exception.EntradaEx.FalsContingutFile;
import src.Exception.EntradaEx.NoExisteixFile;
import src.Exception.EntradaEx.NoTeContingut;// Encara no ho he fet -.-

public class controlEntrada
{
	private entradaFile lola;
	private String [] QueFaremIdirem;
	private String Contingut;
	public controlEntrada (String e) throws NoExisteixFile, FalsContingutFile
	{
		setFile (e);
	}

	public void setFile (String e) throws NoExisteixFile, FalsContingutFile
	{
		lola = new entradaFile (e);
		QueFaremIdirem = lola.queFarem_queDirem ();
									// No veig el pq no ha de funcionar com vull TT
//		if (QueAnemaFer.contentEquals ("null"))
//			throw new EntradaEx ("El fitxer indicat esta buit.");
	}

	public String getQueFaremIdirem (){return QueFaremIdirem [0];}
	//public String [] getQueFaremIdirem (){return QueFaremIdirem;}
	public String getContingut (){return Contingut;}
//	public getVector () {return}
}
