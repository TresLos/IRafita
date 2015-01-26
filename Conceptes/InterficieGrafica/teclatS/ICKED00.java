/*
   Intent Copy past Key Event Demo
*/
package teclatS;

import javax.swing.JFrame;
import java.awt.event.KeyListener;
import java.awt.event.ActionListener;

/*
   El que fare aqui no te gaire sentit logic per a mi.
   Nomes ho faig per aixi poder jo entendre la logica. Nomes ho faig per la logica!
*/
public class ICKED00 extends JFrame// implements KeyListener, ActionListener
{
	public ICKED00 (String e) { super (e); }
	public static void CreateAndShowGUI (String e)
	{
		/* Create and set up the window. */
		ICKED00 frame = new ICKED00 (e);
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		/* Set up the content pane. */
		//frame.addComponentsToPane();
		
		
		//Display the window.
		frame.pack ();
		frame.setVisible (true);
	}
	// private void addComponentsToPane() {
}
/*
   Ara, crec que ja ho tinc entes :)
   Me queda molt poquet per a realitzar el primer pas que necessito i vull fer
*/
