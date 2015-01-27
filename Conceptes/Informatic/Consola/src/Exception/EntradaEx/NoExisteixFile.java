package src.Exception.EntradaEx;

import src.Exception.EntradaEx.ErrorEntrada;

// Simplement no existeix el fitxer indicat
public class NoExisteixFile extends ErrorEntrada
{
	public NoExisteixFile (String e){super ("No s'ha trobat el fitxer:\n\u001B[31m" + e + "\u001B[0m");}
}
