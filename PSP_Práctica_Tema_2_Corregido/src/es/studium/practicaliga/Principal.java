package es.studium.practicaliga;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;


public class Principal 
{	

	public static void main(String[] args) throws IOException 
	{
		// Primero
		// Tratamiento del fichero
		String cadena, cadenaEquipos= "";
		String posibles [][] = new String[40][40];
		String emparejamientos[] = new String[380];

		File fl = new File("Clasificación de la liga.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader (fr);
		
		File flD = new File("Clasificación de la liga terminada.txt");
		FileWriter fw = new FileWriter(flD);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter salida = new PrintWriter(bw);
		
		
		while ((cadena=br.readLine()) != null)
		{
			cadenaEquipos = cadenaEquipos + cadena; 
		}
		
		System.out.println(cadenaEquipos);
		//Se mete en una tabla de cadenas a los equipos de manera individual
		String tabla[] = cadenaEquipos.split(", ");
		
		// Crear un ArrayList de Equipos
		ArrayList <Equipo> lista = new ArrayList <Equipo>();

		// Crear los equipos
		for (String e: tabla)
		{
			lista.add(new Equipo(e));
			
		}
		br.close();

		// VARIABLES PARA BUCLES
		int ii = 1, jj=0;
		int iii = 0, jjj=0;
		int i = 0;
		int j = 0;
		
		int k = 0;//partidos de una jornada

		int m = 0; //jornadas

		int di = 18;
		int dj = 20;

		int partidos = 0;
		int iJornada = 0;

		while (m<19) //Condición para las jornadas en un bucle
		{
			partidos = 0;
			
			while (k<10) 
			{
				for (i=0; i<40 ; i++) //Ida y vuelta y que no se salga de la tabla
				{
					for (j=0; j<40 ; j++) 
					{
						if((i==ii%20) && (j == jj%20))
						{
							//System.out.print(String.format("%3d-%-3d\n", ii%20,jj%20));
							emparejamientos[iJornada] = String.format("%d-%d", ii%20,jj%20);//Se hace le modulo para coger el primero de la tabla
							emparejamientos[iJornada+190] = String.format("%d-%d", jj%20,ii%20);
							iJornada++;
							ii = ii + 2;
							jj = jj + 2;
							partidos++;
						}
						if(partidos>9)
						{
							i = 40;
							j = 40;
						}
					}
				}
				k++;
			}
			//System.out.println("----");
			ii = ii - di;
			jj = jj - dj;
			di = di - 2;
			dj = dj - 2;
			
			k = 0;
			m++;
		}
		System.out.println("");
		System.out.println("================== IDA ==================");
		System.out.println("");
		
		m=1;
		
		for(int y = 0; y < 190; y++)
		{
			if(y%10==0)
			{
				System.out.println("");
				System.out.println("------ Jornada " + m + " ------");
				System.out.println("");
				m++;
			}
			String e[] = emparejamientos[y].split("-");
			System.out.println(String.format("%s - %s", tabla[Integer.parseInt(e[0])], tabla[Integer.parseInt(e[1])]));
		}
		
		System.out.println("");
		System.out.println("================== VUELTA ==================");
		System.out.println("");
		
		for(int y = 190; y < 380; y++)
		{
			if(y%10==0)
			{
				System.out.println("");
				System.out.println("------ Jornada " + m + " ------");
				System.out.println("");
				m++;
			}
			String e[] = emparejamientos[y].split("-");
			System.out.println(String.format("%s - %s", tabla[Integer.parseInt(e[0])], tabla[Integer.parseInt(e[1])]));
		}
		
		
		// Tercero
		// Bucle de 38
		System.out.println("===============================================================");
		int posicion = 0;
		for(int l=0;l<38;l++) 
		{
			Partido partiditos[] = new Partido[10];
			for(int h = 0; h < 10; h++)
			{
				String e[] = emparejamientos[posicion].split("-");
				partiditos[h] = new Partido(lista.get(Integer.parseInt(e[0])), lista.get(Integer.parseInt(e[1])));
				partiditos[h].start();
				posicion++;
			}
			for(int h = 0; h < 10; h++)
			{
				try {
					partiditos[h].join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			System.out.println("");
			System.out.println("============ CLASIFICACIÓN ACTUAL ============");
			System.out.println("");
			// Mostrar Clasificación
			// Mostrar contenido de lista, ORDENADO por puntos
			// Ordenar la lista
			Collections.sort(lista);
			for(Equipo e: lista)
			{
				System.out.println(e.getNombreE()+": "+e.getpA()+" puntos" + " - " + e.gF + " Goles a favor" + " - " +e.gC + " Goles en contra" + "\n");
			}
			
		}
		// Cuarto
		
		for(Equipo e: lista) {
			salida.print(e.getNombreE());
			salida.print(", ");
			//Quitar la coma
		}
		salida.close();
		bw.close();
		fw.close();
		
		// Guardar fichero
		
	}
}
