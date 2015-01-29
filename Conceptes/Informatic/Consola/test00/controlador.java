package test00;

/*
   Ell desideix de que podra fer l'usuari i que no

   Protegeix el sistema i asegura el bon funcionament del programa

   Si tingues poder d'events, podria fer coses molt mes abansades. Tenir en compte per a quan vulgui fer el propi PC */
public class controlador
{
	Usuari caca;
	public controlador ()
	{
		caca = new Usuari ();
/* Em apareix un nou dubte, com que no vull que aquest esperi la caca, m'agradaria que la mateixa tingues poder
   tal com per a cridar el mateix controlador, segurament haure de fer mes nivells de controladors */
	}

/* Nomes es per a demostrar-me a mi mateix el que pot anar pels dos camins */
	public String PelCamiBuscat () { return "Troling muhahaha"; }
}
