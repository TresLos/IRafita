package src.InputOutput.Input;

import src.InputOutput.CIO;

import src.InputOutput.Input.Key.KeyControler;
import src.InputOutput.Input.File.FileControler;

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
}
