package src.Exception.EntradaEx;

import src.Exception.EntradaEx.ErrorEntrada;

// El problema prove que el contingut es buit
public class FalsContingutFile extends ErrorEntrada
{
	public FalsContingutFile (String e){super ("Segurament no conte res el fitxer:\n\u001B[31m" + e + "\u001B[0m");}
}
