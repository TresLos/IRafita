package src.InputOutput.Input.Key;

import src.InputOutput.Input.CI;
// Aqui tindrem un import de src.ControlOrder, on aquest controlara que tot tingui un sentit semantic. Despres a math, ja direm si es correcte matematicament

public class KeyControler
{
// En un futur proxim, aqui l'usuari es comunicara amb l'ordinador

/* Classes necessaries a aquesta classe */
	private CI	up;
	private ReadKey	basic;

	public KeyControler (CI e)
	{
		up = e;
		basic = new ReadKey (this);
	}

	public void Begin ()		{ basic.Begin (); }
	public void Error (String e)	{ up.Error (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { up.PHelperFistMenu		(); }
	public void PHelperFistMenuC	() { up.PHelperFistMenuC	(); }
	public void PHelperFistMenuH	() { up.PHelperFistMenuH	(); }
	public void PHelperFistMenuQ	() { up.PHelperFistMenuQ	(); }
}
