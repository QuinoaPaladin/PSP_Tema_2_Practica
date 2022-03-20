package es.studium.practicaliga;

public class Equipo implements Comparable <Object>
{
	String nombreE;
	int pA;
	int pJ;
	int pG;
	int pP;
	int pE;
	int gF;
	int gC;

	public Equipo(String nombreE) 
	{
		this.nombreE = nombreE;
		this.pA = 0;
		this.pJ = 0;
		this.pG = 0;
		this.pP = 0;
		this.pE = 0;
		this.gF = 0;
		this.gC = 0;
	}
	public String getNombreE() 
	{
		return nombreE;
	}
	public void setNombreE(String nombreE) 
	{
		this.nombreE = nombreE;
	}
	public int getpA() 
	{
		return pA;
	}
	public void setpA(int pA) 
	{
		this.pA = pA;
	}
	public int getpJ() {
		return pJ;
	}
	public void setpJ(int pJ) 
	{
		this.pJ = pJ;
	}
	public int getpG() {
		return pG;
	}
	public void setpG(int pG) 
	{
		this.pG = pG;
	}
	public int getpP() {
		return pP;
	}
	public void setpP(int pP) 
	{
		this.pP = pP;
	}
	public int getpE() {
		return pE;
	}
	public void setpE(int pE) 
	{
		this.pE = pE;
	}
	public int getgF() 
	{
		return gF;
	}
	public void setgF(int gF) 
	{
		this.gF = gF;
	}
	public int getgC() 
	{
		return gC;
	}
	public void setgC(int gC) 
	{
		this.gC = gC;
	}
	public int compareTo(Object o)
	{
		Equipo equipo = (Equipo) o;
		if(this.pA == equipo.pA)
		{
			if(this.gF == equipo.gF)
			{
				if(this.gC<equipo.gC)
				{
					return -1;
				}

				else
				{
					return 1;
				}
			}

			else if (this.gF>equipo.gF)
			{
				return -1;
			}

			else
			{
				return 1;
			}
		}
		else if(this.pA>equipo.pA)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
