package es.studium.psp_practica_tema_2;

import java.util.ArrayList;

public class Jornada
{
	private ArrayList<Partido> Partidos;


	public Jornada()
	{
		Partidos = null;
	}

	public Jornada (ArrayList a)
	{
		Partidos = a;
	}
	
	public ArrayList getPartidos() 
	{
		return Partidos;
	}

	public void setPartidos(ArrayList a) 
	{
		Partidos = a;
	}
}