package src.InputOutput.Output.Window;

public class WindowControler
{
/* Classes necessaries a aquesta classe */
	private WriteWindows printer;

	public WindowControler () { printer = new WriteWindows (); }

	public void Error (String e) { printer.Error (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { printer.PHelperFistMenu	(); }
	public void PHelperFistMenuC	() { printer.PHelperFistMenuC	(); }
	public void PHelperFistMenuH	() { printer.PHelperFistMenuH	(); }
	public void PHelperFistMenuQ	() { printer.PHelperFistMenuQ	(); }
}
