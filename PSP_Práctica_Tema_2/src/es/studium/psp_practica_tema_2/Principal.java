package es.studium.psp_practica_tema_2;

public class Principal
{

	public static void main(String[] args)
	{
		Equipo equipo = new Equipo();
		Partido partido = new Partido();
		Jornada jornada = new Jornada();
		Calendario calendario = new Calendario (equipo, partido, jornada);
		
		calendario.crearEquipos();
		
		for(int i=0; i<calendario.equiposCreados.size() ;i++)
		{
			System.out.println(calendario.equiposCreados.get(i).getNombre());
		}
	}
	
}
