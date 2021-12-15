package es.studium.psp_practica_tema_2;

public class Equipo
{
	private String nombre;
	private int puntosActuales;
	private int partidosJugados;
	private int partidosGanados;
	private int partidosPerdidos;
	private int partidosEmpatados;
	private int golesAFavor;
	private int golesEnContra;
	
	/* Constructor por defecto */
	  public Equipo () 
	  {
		  nombre = "";
		  puntosActuales = 0;
		  partidosJugados = 0;
		  partidosGanados = 0;
		  partidosPerdidos = 0;
		  partidosEmpatados = 0;
		  golesAFavor = 0;
		  golesEnContra = 0;
	  }
	 
	  /* Constructor con parámetros */
	  public Equipo (String a, int b, int c, int d, int e, int f, int g, int h) 
	  {
		  nombre = a;
		  puntosActuales = b;
		  partidosJugados = c;
		  partidosGanados = d;
		  partidosPerdidos = e;
		  partidosEmpatados = f;
		  golesAFavor = g;
		  golesEnContra = h;

	  }
	  
	  public String getNombre() 
	  {
		  return nombre;
	  }
	 
	  public void setNombre(String a) 
	  {
		  nombre = a;
	  }
	  
	  public int getPuntosActuales() 
	  {
		  return puntosActuales;
	  }
	 
	  public void setPuntosActuales(int b) 
	  {
		  puntosActuales = b;
	  }
	  
	  public int getPartidosJugados() 
	  {
		  return partidosJugados;
	  }
	 
	  public void setPartidosJugados(int c) 
	  {
		  partidosJugados = c;
	  }
	  
	  public int getPartidosGanados() 
	  {
		  return partidosGanados;
	  }
	 
	  public void setPartidosGanados(int d) 
	  {
		  partidosGanados = d;
	  }
	  
	  public int getPartidosPerdidos() 
	  {
		  return partidosPerdidos;
	  }
	 
	  public void setPartidosPerdidos(int e) 
	  {
		  partidosPerdidos = e;
	  }
	  public int getPartidosEmpatados() 
	  {
		  return partidosEmpatados;
	  }
	 
	  public void setPartidosEmpatados(int f) 
	  {
		  partidosEmpatados = f;
	  }
	  public int getGolesAFavor() 
	  {
		  return golesAFavor;
	  }
	 
	  public void setGolesAFavor(int g) 
	  {
		  golesAFavor = g;
	  }
	  public int getGolesEnContra() 
	  {
		  return golesEnContra;
	  }
	 
	  public void setGolesEnContra(int h) 
	  {
		  golesEnContra = h;
	  }
}