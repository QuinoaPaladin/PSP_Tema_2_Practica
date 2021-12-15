package es.studium.psp_practica_tema_2;

public class Partido
{
	private Equipo equipoLocal;
	private Equipo equipoVisitante;	

	public Partido()
	{
		equipoLocal = null;
		equipoVisitante = null;		
	}

	public Partido (Equipo a, Equipo b)
	{
		equipoLocal = b;
		equipoVisitante = a;		
	}

	public Equipo getEquipoLocal() 
	{
		return equipoLocal;
	}

	public void setEquipoLocal(Equipo a) 
	{
		equipoLocal = a;
	}
	public Equipo getEquipoVisitante() 
	{
		return equipoVisitante;
	}

	public void setEquipoVisitante(Equipo b) 
	{
		equipoVisitante = b;
	}
}
