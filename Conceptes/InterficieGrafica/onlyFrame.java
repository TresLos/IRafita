// http://dalila.sip.ucm.es/~manuel/JSW1/Slides/Swing.pdf
import javax.swing.*; // He llegit que si vull fer una interficie grafica, fer anar SWING

public class onlyFrame
{
	public static void main (String[] args)
	{
		JFrame f = new JFrame ("Sista la mar de be ;)");	// Primer crear Frame
		//f.setSize (400, 300);					// Tamany
	// Jo com que funciono amb dwm, no puc definir tamany muhahhahhaha
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);	// Drets per tancar la pestanya
	// Jo com que funciono amb dwm, no necessito drets per tancar muhahahahaha
		// Si que ho necessito, ja que sino, el pc continua pensant ...
		f.setVisible (true);					// M'ho mostra al gran public - jiji -
	}
}
