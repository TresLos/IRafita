package src.InputOutput.Input.Key;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

// Es el primer no Controler que estic fent xD
// Que collons fa el continue en java?
public class ReadKey
{
/* Classes necessaries a aquesta classe */
	private KeyControler up;
	private Reader reader;
	private boolean keep; //continuar

	public ReadKey (KeyControler e)
	{
		up = e;
		keep = true;

		Console console = System.console ();
		reader = console.reader ();
	}

	public void Begin ()
	{
		FirstMenu ();
	}

	public void FirstMenu ()
	{
		while (keep)
		{
			try			{ FirstOption ((char) reader.read ()); }
			catch (IOException ex)	{ up.Error (ex.toString ()); }
		}
	}

	public void FirstOption (char e)
	{
		switch (e)
		{
		case 'c':
			System.out.println ("J");
			break;
		case 'h':
			System.out.println ("dJ");
			break;
		case 'q':
			keep = false;
		}
	}
}
