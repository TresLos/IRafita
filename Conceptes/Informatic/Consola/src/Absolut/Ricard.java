// Ja que portava dinamica alcolica. em fa ben pensar
package src.Absolut;

// Tots els errors k jo mateix he inventat:
// import ...

// Aqui nomes el que he creat jops Communicacio/Entrada/Sortida/Objecte = 4
import src.Entrada.controlEntrada;

import src.Exception.EntradaEx.FalsContingutFile;
import src.Exception.EntradaEx.NoExisteixFile;
import src.Exception.EntradaEx.NoTeContingut;

public class Ricard
{
// Espero que quedi clar. Aixo nomes es ara per testejar el codi
                                                                     /*
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>                                            Communicacio                                            >>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                                                     */
	// Crec k aquest es l'unic que realment no te sentit en si, pq ell no el crida, ell respon a aquest (:)
                                                                     /*
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>                                               Entrada                                              >>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
                                                                     */

	public String llegeixFitxer (File e)
	{
		
	}
/*Coses exageradament velles*/
	private controlEntrada Entradeta;
	public void entrada (String e) throws NoExisteixFile, FalsContingutFile
	{
		Entradeta = new controlEntrada (e);
	}

// Funcio tmp per testejar codi (:)
	public String mostra ()
	{
		return Entradeta.getQueFaremIdirem ();
	}
	public String contingut ()
	{
		return Entradeta.getContingut ();
	}
}
		/*	borracho.entrada (e);
			System.out.println (borracho.mostra ());*/
