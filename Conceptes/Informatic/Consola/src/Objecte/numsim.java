package src.Objecte;


// copy past de BigError 1
public class numsim // Numero i simbol
{
	private int prioritat;
	public int preference () {return prioritat;}
	private String contingut;
	@Override
	public String toString() {return contingut;}
	public numsim (String e)
	{
		contingut = e;
		try
		{
			Integer l = Integer.parseInt(e);
			prioritat = -1;
		}catch (Exception Ex)
		{
			switch (e)
			{
				case "+":	prioritat = 1;
						break;
				case "-":	prioritat = 1;
						break;
				case "*":	prioritat = 2;
						break;
				case "/":	prioritat = 2;
						break;
				case "^":	prioritat = 3;
						break;
				case "sqrt":	prioritat = 3;
						break;
				case "(":	prioritat = 100;
						break;
				case ")":	prioritat = -100;
						break;
			}
		}
	}
}
