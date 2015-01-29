package test00;

import java.io.Console;
import java.io.Reader;
import java.io.IOException;
/*
   Un dels interesos ve a ser controlar adecuadament el controlador, aixi que tot i que et crei el controlador, tu poder fer crides al mateix.
*/
public class Usuari
{
	Reader reader;
	boolean endProgram;
	public Usuari ()
	{
/* Inicialitzar les variables */
		Console console = System.console ();
		reader = console.reader ();

		FirstMenu ();
	}
	public void FirstMenu ()
	{
		endProgram = true;
		int i=0;
		while (endProgram)
			try {
				FirstMenuEleccio ((char) reader.read ());
			} catch (IOException ex) { System.out.println (ex + "\nError en reader.read\n"); }
	}
	private void FirstMenuEleccio (char e)
	{
		switch (e)
		{
			case 'h':
				System.out.println ("\nNo hi ha ajuda o.O\n");
				break;
			case 'q':/* Recordar, aquest sera l'ultim */
				System.out.println ("\nEsperem que hagi pogut fer tot el desitjat. Fins aviat ;)\n");
				endProgram = false;
		}
	}
}

// Solucio 1 System.in.read()
