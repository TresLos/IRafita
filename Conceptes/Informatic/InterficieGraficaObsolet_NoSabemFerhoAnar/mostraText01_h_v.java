import javax.swing.JFrame; // interficie grafica
import javax.swing.JLabel; // Text

import javax.swing.JTextArea;

public class mostraText01_h_v extends JFrame
{
	private JLabel text01;
	public mostraText01_h_v (String e)
	{
		super (e);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		// Creo el que vull posar
		text01 = new JLabel ("Soc un novat en les interficies grafiques muhahaha");

		// Finalment ho poso
		getContentPane().add(text01);

		// per acabar
		pack ();
	}
}

/* Solucio al cap de investigar molt
http://www.java2s.com/Code/Java/Swing-JFC/HelloWorldSwing.htm
*/
