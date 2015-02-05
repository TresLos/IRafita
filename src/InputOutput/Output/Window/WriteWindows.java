package src.InputOutput.Output.Window;

public class WriteWindows
{
/* Classes necessaries a aquesta classe */
	private Help helper;

	public WriteWindows () { helper = new Help (); }

	public void Error (String e)	{ System.out.println (e); }

/* Missatges d'ajuda */
	public void PHelperFistMenu	() { System.out.println (helper.FistMenu	()); }
	public void PHelperFistMenuC	() { System.out.println (helper.FistMenuC	()); }
	public void PHelperFistMenuH	() { System.out.println (helper.FistMenuH	()); }
	public void PHelperFistMenuQ	() { System.out.println (helper.FistMenuQ	()); }
}
