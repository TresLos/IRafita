package src.InputOutput.Input;

import src.InputOutput.CIO;

import src.InputOutput.Input.Key.KeyControler;
import src.InputOutput.Input.File.FileControler;

import src.Understand.Control_Shunting_yard_algorithm;

public class CI
{
/* Classes necessaries a aquesta classe */
	private CIO		up;
	private KeyControler	user;
	private FileControler	file;

	public CI (CIO e)
	{
		up = e;
		user = new KeyControler		(this);
		file = new FileControler	(this);
	}

	public void Begin ()		{ user.Begin (); }
	public void Error (String e)	{ up.Error (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { up.PHelperFistMenu		(); }
	public void PHelperFistMenuC	() { up.PHelperFistMenuC	(); }
	public void PHelperFistMenuH	() { up.PHelperFistMenuH	(); }
	public void PHelperFistMenuQ	() { up.PHelperFistMenuQ	(); }
}
