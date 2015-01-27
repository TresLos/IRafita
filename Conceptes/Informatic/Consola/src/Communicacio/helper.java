// Ha de ser un final

package src.Communicacio;
public class helper
{
	public String Normal ()
	{
		return "Aixo es l'ajuda, on idicarem els mes normals:\n" +
			"-: up Directory\n" +
			"a: show Absolute path\n" +
			"q: quit program\n" +
			"s: show all of directoris and files\n" +
			"h: helper than you\n" +
			"c: Fracas programming";
	}
	public String c ()
	{return "Es pot fer anar per a saber quan ha acabat l'execucio";}
	public String h ()
	{return "Si us plau, tingues imaginacio";}

	public String s ()
	{
		return "Mostra que conte:\n" +
			"-\u001B[32m Fitxer :)\u001B[0m\n" +
			"-\u001B[36m Directory :)\u001B[0m\n" +
			"-\u001B[33m Altres :(\u001B[0m";
	}

	public String a ()
	{
		return "El que diu el heper iluminat !! :["; //]
	}

	public String minus ()
	{
		return "Pessat, pessadet :[=]";
	}

	public String q ()
	{
		return "Sortir d'on estiguis. Tanca el programa en si";
	}
}
