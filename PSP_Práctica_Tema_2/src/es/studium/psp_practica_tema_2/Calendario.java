package es.studium.psp_practica_tema_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calendario
{
	Equipo claseEquipo = null;
	Partido clasePartido = null;
	Jornada claseJornada = null;
	
	ArrayList<String> nombresEquipos = new ArrayList<String>();
	ArrayList<Equipo> equiposCreados = new ArrayList<Equipo>();	

	public Calendario (Equipo claseEquipo, Partido clasePartido, Jornada claseJornada)
	{
		this.claseEquipo = claseEquipo;
		this.clasePartido = clasePartido;
		this.claseJornada = claseJornada;

		
		
	}

	public void crearEquipos()
	{
			
		
		try
		{

			FileReader fr = new FileReader("equipos.txt");				
			BufferedReader entrada = new BufferedReader(fr);
			String s;

			while((s=entrada.readLine())!=null)
			{
				String[] nombres = s.split(",");
						
				

				for (int i = 0; i < nombres.length; i++)
				{	
					nombresEquipos.add(nombres[i]);
				}

				for (int i = 0; i < nombresEquipos.size(); i++)
				{
					Equipo equipo = new Equipo();
					equipo.setNombre(nombresEquipos.get(i));
					equipo.setPuntosActuales(0);
					equipo.setPartidosJugados(0);
					equipo.setPartidosGanados(0);
					equipo.setPartidosPerdidos(0);
					equipo.setPartidosEmpatados(0);
					equipo.setGolesAFavor(0);
					equipo.setGolesEnContra(0);					
					equiposCreados.add(equipo);
				}

				for (int i = 0; i < equiposCreados.size(); i++)
				{	
					equiposCreados.get(i).getNombre();	
					//System.out.println(equiposCreados.get(i).getNombre());
				}							
			}
				
			entrada.close();
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}



}
