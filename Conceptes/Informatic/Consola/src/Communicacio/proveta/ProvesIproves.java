import java.io.Console;
import java.io.IOException;
import java.io.Reader;

import java.io.File;

public class ProvesIproves
{
	public static void main (String [] aqunaPatata)
	{
		ProvesIproves tutu = new ProvesIproves ();
	}
	public ProvesIproves ()
	{
		while (true)
			EventTeclat ();
	}

	private void EventTeclat ()
	{
		try
		{
			lolita ();
		}catch (Exception Ex){System.out.println ("Error amb la Manola o.O");}
	}

	private void lolita () throws IOException, InterruptedException
	{
		String [] cmd = {"/bin/sh", "-c", "stty raw </dev/tty"};
		Runtime.getRuntime ().exec (cmd).waitFor ();
		Console console = System.console ();
		Reader reader = console.reader ();

		System.out.println ("Benvingut (:)");

		boolean Nend = true;
		while (Nend)
		{
			switch (reader.read ())
			{
				case 'c':
					console.flush ();
					break;
				case 'h':
					System.out.println ("jaja");
					break;
				case 'd':
					System.out.println ("Carpetes i fitxers:");
				case 'q':
					Nend = false;
			}
		}
	}
}
