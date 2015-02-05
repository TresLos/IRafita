package src.InputOutput.Output.Window;

public class Help
{
	public String FistMenu	() { return "Esta en proces"; }
	public String FistMenuC	()
	{
		int i;
		String tot = "";
		for (i = 0; i < 700; i++)
			tot += "\n\033[" + i + "m Parrafada:\t" + i;
		return tot;
	}
	public String FistMenuH	() { return Red ("jope"); }
	public String FistMenuQ	() { return End ("jope"); }

	private String Red (String e) { return "\033[1m" + e + "\033[0m"; }
	private String End (String e) { return "\033[3m" + e + "\033[0m"; }
}
