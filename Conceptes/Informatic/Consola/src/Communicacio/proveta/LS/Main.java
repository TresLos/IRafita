import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
  *
  * @author luciano
  */
public class Main
{

	/**
	  * List a directory
	  * @param f Directory path
	  */
public static void lsDirectory ( File dir )
{
File[] archivos = dir.listFiles();
for ( int i=0 ; i System.out.print( i +”) ” + archivos[i].getName() + “t” );
if ( archivos[i].isDirectory() ) {
lsDirectory( archivos[i] );
}
String date = new SimpleDateFormat(“dd/MM/yyyy HH:mm:ss”).format(new Date ( archivos[i].lastModified() ));
System.out.println(date);
}
}

/**
  * main method
  * @param args argumentos de línea de comandos
  */
public static void main(String[] args) {
String path = null;
try {
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
System.out.print(“Ingrese directorio:”);
path = in.readLine();
} catch (IOException ex) {
Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
}

File dir = new File(path);
if (!dir.exists()) {
System.out.println(“Directorio no existe”);
} else {
lsDirectory(dir);
}
}
}
