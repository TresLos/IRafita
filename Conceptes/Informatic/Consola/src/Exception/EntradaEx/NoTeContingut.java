package src.Exception.EntradaEx;

import src.Exception.EntradaEx.ErrorEntrada;

// Que no conte la segona part
public class NoTeContingut extends ErrorEntrada
{
	public NoTeContingut (String e){super ("Minim no te el contingut el fitxer:\n\u001B[31m" + e + "\u001B[0m");}
}
