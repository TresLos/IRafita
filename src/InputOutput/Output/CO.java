package src.InputOutput.Output;

import src.InputOutput.CIO;

import src.InputOutput.Output.Window.WindowControler;
import src.InputOutput.Output.File.FileControler;

public class CO
{
	private CIO		up;
	private FileControler	file;
	private WindowControler	user;

	public CO (CIO e)
	{
		up = e;
		file = new FileControler	();
		user = new WindowControler	();// Crec que aquest sobra 'this'
	}

	public void Error (String e) { user.Error (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { user.PHelperFistMenu	(); }
	public void PHelperFistMenuC	() { user.PHelperFistMenuC	(); }
	public void PHelperFistMenuH	() { user.PHelperFistMenuH	(); }
	public void PHelperFistMenuQ	() { user.PHelperFistMenuQ	(); }
}
