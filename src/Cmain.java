package src;

import src.InputOutput.CIO;

public class Cmain
{
/* Els objectes que necessita aquest controlador */
	private CIO InputOutputControler;

	public Cmain ()
	{
		InputOutputControler = new CIO (this);
	}
}
