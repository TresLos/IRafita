package src.Communicacio;
import src.Communicacio.helper;

import src.Absolut.Ricard;

import src.Exception.EntradaEx.FalsContingutFile;
import src.Exception.EntradaEx.NoExisteixFile;
import src.Exception.EntradaEx.NoTeContingut;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

import java.io.File;
import java.util.ArrayList;

public class simplon
{
	File [] Futur; // On puc anar a parar
	File [] EnMemoria; // els que tinc
	// En memoria, voldria un nom... Aixi k
	// Segurament ho canviare
// De la mateixa manera, voldria fero amb el Ricard
	Ricard borracho;
	public simplon ()
	{
		borracho = new Ricard ();
		try{
			norman ();
		}catch (Exception Ex){
			System.out.println ("Fatal Error");
		};
	}

	Reader reader;
	File vista;
	helper ajuda;
	boolean end;
	private void norman () throws InterruptedException, IOException
	{
//		String [] cmd = {"/bin/sh", "-c", "stty raw </dev/tty"};	 currada... No cal apretar Enter
		String [] cmd = {"/bin/sh", "-c", "styy raw </dev/tyy"};	// Cutre
		Runtime.getRuntime ().exec (cmd).waitFor ();
		Console console = System.console ();
		reader = console.reader ();

		vista = new File ("to");
		ajuda = new helper ();

		System.out.println ("Modo normal");

		end = true;
		while (end)
		{
			try{
				PrincipalMenu ((char) reader.read ());
			}catch (IOException ex){System.out.println ("Peta en l'ajuda");}
		}
	}

	private void PrincipalMenu (char e) throws IOException
	{
		switch (e)
		{
		case 'c':
			System.out.println (Basura ());
			break;
		case 'h':
			Ajuda ();
			break;
		case 's':
			MostraQuehiha ();
			break;
		case 'a':
			System.out.println (vista.getAbsolutePath ());
			break;
		case '-':
			upDirectory ();
			break;
// Aixo encara no te ajuda !! :(.):
		case 'g':
			MouteObra ();
			break;

		case 'q':
			end = false;
		}
	}

	private String Basura ()
	{
		return "\n\n\n\n\n\n\n\nTesperem (:)" +
			"\u001B[0m Muhaha" + 
			"\u001B[30m Lorei lerei" +
			"\u001B[31m Bazucaaaa" +
			"\u001B[32m Compplimientos salsados" +
			"\u001B[33m Marraqeix" +
			"\u001B[34m Nunca terminanarn coloretes" +
			"\u001B[35m maix i maix" +
			"\u001B[36m popi" +
			"\u001B[37m tete";
	}

	private void MouteObra () throws IOException
	{
		int i =0;
		char c = (char) reader.read ();
		while (c >= '0' && c <= '9')
		{
			/*switch (c)
			{
			case '0': i *= 10; break;
			case '1': i = i*10 + 1;break;
			case '2': i = i*10 + 2;break;
			case '3': i = i*10 + 3;break;
			case '4': i = i*10 + 4;break;
			case '5': i = i*10 + 5;break;
			case '6': i = i*10 + 6;break;
			case '7': i = i*10 + 7;break;
			case '8': i = i*10 + 8;break;
			case '9': i = i*10 + 9;break;
			}*/
			i = 10*i + (int) c - 48;
			c = (char) reader.read ();
		}
		if (i >= 0 && i < Futur.length)
		{
			if (Futur[i].isDirectory ())
			{
				vista = Futur[i];
			}else if (Futur[i].isFile ())
			{
				borracho.llegeixFitxer (Futur[i]);
			}
// Faltaria per a File
		}
		PrincipalMenu (c);
		//		Futur
	}

	private void Ajuda () throws IOException
	{
// El default fa que si no apretes res mes... Llavors va directament alla :)
		switch (reader.read ())
		{
			case 'c':
				System.out.println (ajuda.c ());
				break;
			case 'h':
				System.out.println (ajuda.h ());
				break;
			case 's':
				System.out.println (ajuda.s ());
				break;
			case 'a':
				System.out.println (ajuda.a ());
				break;
			case '-':
				System.out.println (ajuda.minus ());
				break;
			case 'q':
				System.out.println (ajuda.q ());
				break;
			default:
				System.out.println (ajuda.Normal ());
		}
	}

	private void upDirectory ()
	{
		// nova idea:substring(int beginIndex, int endIndex) lastIndexOf
		String tot = vista.getAbsolutePath ();
		String up = tot.substring (0, tot.lastIndexOf ("/"));
		vista = new File (up);
		//System.out.println (up + "\nVell");
		/*// Vell
		String [] fullAbsolut = vista.getAbsolutePath ().split ("/");
		up = "";
		int i;
		for (i = 1; i + 1 < fullAbsolut.length; i++)
			up += "/" + fullAbsolut[i];
		System.out.println (up);*/
	}

	private void MostraQuehiha ()
	{
		Futur = vista.listFiles ();
		File tmp;
		int i;
		for (i = 0; i < Futur.length; i++) 
		{
			tmp = Futur [i];
			System.out.print ("\u001B[33m" + i + ". ");
			if (tmp.isFile ())
			{
				//System.out.println ("\u001B[32m" + tmp.getName () + "	" + tmp.getTotalSpace () + "\u001B[0m");
				System.out.println ("\u001B[32m" + tmp.getName () + "\u001B[0m");
			}else if (tmp.isDirectory ())
			{
				System.out.println ("\u001B[36m" + tmp.getName () +"\u001B[0m");
			}else	{System.out.println ("\u001B[33m" + tmp.getName () + "\u001B[0m");}
		}
	}


	public void testejarCodi (String e)
	{
		inicia (e);
//		inicia ("ErrorNoExisteix.muhaha");
//		inicia ("errorFaltaSegonaPart.txt");
//		inicia ("errorBuit.txt");	// Problema k no accepta actualment els errors!!
	}

	private void inicia (String e)
	{
		try
		{
			borracho.entrada (e);
			System.out.println (borracho.mostra ());
			System.out.println (borracho.contingut ());
//			System.out.println (ctrlE.getComEntra ());
//			System.out.println (ctrlE.visualitzaE ()); // igual k entra
//			System.out.println (ctrlE.visualitzaM ()); // com interpreta la maquina
//			System.out.println (ctrlE.visualitzaL ()); // pel LaTeX
		}catch (NoExisteixFile fre){System.out.println (fre);
		}catch (FalsContingutFile fre){System.out.println (fre);
		}//catch (NoTeContingut fre){System.out.println (fre);}
	}
}
