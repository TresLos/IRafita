package src.InputOutput;

import src.Cmain;

import src.InputOutput.Input.CI;
import src.InputOutput.Output.CO;

public class CIO
{
/* Els objectes que necessita aquest controlador */
	private Cmain	up;
	private CI	input;
	private CO	output;

	public CIO (Cmain e)
	{
		up = e;
		input	= new CI (this);
		output	= new CO (this);
	}

	public void Begin ()		{ input.Begin (); }
	public void Error (String e)	{ output.Error (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { output.PHelperFistMenu	(); }
	public void PHelperFistMenuC	() { output.PHelperFistMenuC	(); }
	public void PHelperFistMenuH	() { output.PHelperFistMenuH	(); }
	public void PHelperFistMenuQ	() { output.PHelperFistMenuQ	(); }
}
