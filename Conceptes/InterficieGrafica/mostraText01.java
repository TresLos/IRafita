// http://docs.oracle.com/javase/tutorial/uiswing/components/text.html
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// Objectes per un futur :)

public class mostraText01
{
	public static void main (String[] args)
	{
		mostraText01_h_v v = new mostraText01_h_v ("Sista be ;)");
		v.setVisible (true);
	}
}
/* Diferentes coses que ens permet el swing
javax.accessibility		javax.swing.plaf	javax.swing.text
javax.swing			javax.swing.plaf.basic	javax.swing.text.html
javax.swing.border		javax.swing.plaf.metal	javax.swing.text.html.parser
javax.swing.colorchooser	javax.swing.plaf.multi	javax.swing.text.rtf
javax.swing.event		javax.swing.plaf.synth	javax.swing.tree
javax.swing.filechooser		javax.swing.table	javax.swing.undo
*/
