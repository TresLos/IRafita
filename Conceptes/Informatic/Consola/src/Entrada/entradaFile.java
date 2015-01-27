package src.Entrada;

import src.Exception.EntradaEx.FalsContingutFile;
import src.Exception.EntradaEx.NoExisteixFile;
import src.Exception.EntradaEx.NoTeContingut;

import java.io.File;

import java.io.FileInputStream;
import java.util.ArrayList;

import java.util.Scanner;
import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class entradaFile
{
	private File fitxer;
	private String nomFitxer;
	private BufferedReader bf;
	public entradaFile (String e)
	{
		fitxer = new File (e);
		nomFitxer = e;
	}

	public String [] queFarem_queDirem () throws NoExisteixFile, FalsContingutFile
	{
		if (!fitxer.exists ())
			throw new NoExisteixFile (nomFitxer);
		// Tot el codi que no ta
		try
		{
			FileInputStream inputStream = new FileInputStream (fitxer);
			Scanner scanner = new Scanner (inputStream);
			DataInputStream in = new DataInputStream (inputStream);
			bf = new BufferedReader (new InputStreamReader (in));
			return bf.readLine ().split (" ");
		}catch (Exception tre){throw new FalsContingutFile (nomFitxer);}
	}
}
