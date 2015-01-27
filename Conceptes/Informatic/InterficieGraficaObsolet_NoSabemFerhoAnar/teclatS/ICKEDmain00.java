package teclatS;

// poder fer el main ?
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/*
   Ara estem fent el cas irreal on la interficie grafica es el centre de tot

   Quan faci el meu programa real, espero i desitjo de tenir un controlador gran i poderos, que mantingui a ralla la interficie grafica
*/
public class ICKEDmain00
{
	public static void main (String[] args)
	{
/*		/* Use an appropriate Look and Feel */
/*		try {
		    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
/*		    UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
		    ex.printStackTrace();
		} catch (IllegalAccessException ex) {
		    ex.printStackTrace();
		} catch (InstantiationException ex) {
		    ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
		    ex.printStackTrace();
		}

		/* Turn off metal's use of bold fonts */
/*		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater (new Runnable()
		{
			public void run ()
			{
				loli = new ICKED00 ();
				loli.CreateAndShowGUI ();
			}
		});
 */
		ICKED00 loli = new ICKED00 ("teclejant, molts projectes endavant ;)");
		loli.CreateAndShowGUI ("teclejant, molts projectes endavant ;)");
/*
   Mil de milers d'errors, nomes perque tenia declarat loli fora d'aqui... oks el main nomes conte una linia per a mi

   Ara descobreixo que el problema nomes era declarar la loli fora... RAR non entenc el perque!
*/
	}
}
