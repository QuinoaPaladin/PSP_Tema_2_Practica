package es.studium.practicaliga;

import java.util.Random;

public class Partido extends Thread 
{

	int golesEquipoUno;
	int golesEquipoDos;

	Random rdUno = new Random();
	Equipo emparejamiento[] = new Equipo[2];

	public Partido() 
	{

	}

	public Partido(Equipo e1, Equipo e2) 
	{
		emparejamiento[0] = e1;
		emparejamiento[1] = e2;
	}

	public Equipo[] getEmparejamiento()
	{
		return emparejamiento;
	}

	public Equipo[] getEmparejamientoVuelta()
	{
		Equipo emparejamientoVuelta[] = new Equipo[2];
		emparejamientoVuelta[0] = emparejamiento[1];
		emparejamientoVuelta[1] = emparejamiento[0];
		return emparejamientoVuelta;
	}

	public void run() 
	{
		golesEquipoUno = rdUno.nextInt(5);
		golesEquipoDos = rdUno.nextInt(5);

		//golesEquipoUno = golesEquipoUno + (10/emparejamiento[0].getpA());
		//golesEquipoDos = golesEquipoDos + (10/emparejamiento[1].getpA());
		try 
		{
			sleep(5*100);
		} 

		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Actualizar
		// Puntos
		// Goles a favor
		// Goles en contra
		// Partidos jugados
		// Si gana o pierde
		// Puntos 

		// Partidos Ganados
		// Partidos Perdidos
		// Partidos Empatados

		if (golesEquipoUno == golesEquipoDos) 
		{			
			emparejamiento[0].setpA(emparejamiento[0].getpA() + 1);
			emparejamiento[1].setpA(emparejamiento[1].getpA() + 1);	
		}

		else if (golesEquipoUno > golesEquipoDos) 
		{
			emparejamiento[0].setpA(emparejamiento[0].getpA() + 3);
			emparejamiento[1].setpA(emparejamiento[1].getpA());
		}
		
		else if (golesEquipoUno < golesEquipoDos) 
			
		{

			emparejamiento[0].setpA(emparejamiento[0].getpA());
			emparejamiento[1].setpA(emparejamiento[1].getpA() + 3);
		}
		
		emparejamiento[0].setgF(emparejamiento[0].getgF() + golesEquipoUno);
		emparejamiento[1].setgF(emparejamiento[1].getgF() + golesEquipoDos);

		emparejamiento[0].setgC(emparejamiento[0].getgC() + golesEquipoDos);
		emparejamiento[1].setgC(emparejamiento[1].getgC() + golesEquipoUno);

		emparejamiento[0].setpJ(emparejamiento[0].getpJ() + 1);
		emparejamiento[0].setpJ(emparejamiento[0].getpJ() + 1);

		// Mostrar resultado tipo Betis 3- Sevilla 3
		mostrarResultado();

	}
	public void mostrarResultado() 
	{
		System.out.println(emparejamiento[0].getNombreE()+ ": " + golesEquipoUno + " vs " + emparejamiento[1].getNombreE()+ ": " + golesEquipoDos);	
	}
}
