package Procesamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import modelo.Adicion;
import modelo.Administrador;
import modelo.Cama;
import modelo.Empleado;
import modelo.Habitacion;
import modelo.Recepcionista;
import modelo.Usuario;

public class Loader
{
	public static Map<String, Adicion> cargarAdiciones() throws IOException
	{
		Map<String, Adicion> adiciones = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\git\\Proyecto_1\\data\\adiciones"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String nombre = partes[0];
			float precio = Float.valueOf(partes[1]);
				
			Adicion laAdicion = adiciones.get(nombre);
				
			if (laAdicion == null)
			{
				laAdicion = new Adicion(nombre, precio);
				adiciones.put(nombre, laAdicion);	
			}
			
			
			linea = br.readLine(); 
		}
		br.close();
		
		//System.out.println(adiciones.keySet());
		//System.out.println(adiciones.get("TV").getPrecio());
		
		return adiciones;
	}
	
	public static Map<String, Cama> cargarCamas() throws IOException
	{
		Map<String, Cama> camas = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1-main (2)\\Proyecto_1-main\\data\\camas"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String nombre = partes[0];
			float precio = Float.valueOf(partes[1]);
			int capacidad = Integer.parseInt(partes[2]);
				
			Cama laCama = camas.get(nombre);					
			
			if (laCama == null){
				laCama = new Cama(nombre, capacidad, precio);
				camas.put(nombre, laCama);
			}
			
			linea = br.readLine();
		}
		br.close();
		
		//System.out.println(camas.keySet());
		//System.out.println(camas.get("Doble").getCapacidad());
		
		return camas;
	}
	
		public static ArrayList <Usuario>cargarUsuarios() throws FileNotFoundException, IOException
	{	
		
		ArrayList <Usuario> Usuarios = new ArrayList<>();
		Usuario usuario = null;
				
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\git\\Proyecto_1\\data\\usuarios"));
		
		String linea = br.readLine();
		while (linea != null) 
		{
			String[] partes = linea.split(";");

			String login = partes[0];
			String password = partes[1];
			String nombre = partes[2];
			String tipoUsuario = partes[3];
			
			if (tipoUsuario.equals("empleado")) {
				usuario = new Empleado (login, password, nombre, tipoUsuario);
			}
			
			else if (tipoUsuario.equals("admin")) {
				usuario = new Administrador (login, password, nombre, tipoUsuario);
			}
			
			else if (tipoUsuario.equals("recepcionista")) {
				usuario = new Recepcionista (login, password, nombre, tipoUsuario);
			}	
						
			Usuarios.add(usuario);
			
			linea = br.readLine();
		}
		br.close();
		
		return Usuarios;
		
		
	}
	
		public static Map<Integer, Habitacion> cargarHabitaciones() throws FileNotFoundException, IOException
		{
			Map<Integer, Habitacion> habitaciones = new HashMap<>();
		
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\valen\\Downloads\\Proyecto_1-main (2)\\Proyecto_1-main\\data\\habitaciones"));
		
			String linea = br.readLine();
			while (linea != null) 
			{
	
				String[] partes = linea.split(";");
						
				int id = Integer.parseInt(partes[0]);
				String tipo = partes[1];
				float precioBase = Float.valueOf(partes[2]);
				int capacidad = 0;
				int capacidadKids = 0;
				float precioFinal = precioBase;
				ArrayList<Cama> listaCamas = new ArrayList<>();
				ArrayList<Adicion> listaAdiciones = new ArrayList<>();
				
				Habitacion laHabitacion = habitaciones.get(id);
				
				String[] camas = partes[3].split(",");
				
				for (String cama : camas) 
				{
					listaCamas.add(cargarCamas().get(cama));
					capacidad+=cargarCamas().get(cama).getCapacidad();
					precioFinal+=cargarCamas().get(cama).getPrecio();
				}
				
				String[] kids = partes[4].split(",");

				for (String kid : kids) 
				{
					capacidadKids++;
					if (kid!="") 
					{
						capacidadKids++;
					}

				}

				String[] adiciones = partes[5].split(",");
				
				for (String adicion : adiciones) 
				{
					listaAdiciones.add(cargarAdiciones().get(adicion));
					precioFinal+=cargarAdiciones().get(adicion).getPrecio();
				}
				
				//Crea la habitacion
				if (laHabitacion == null)
				{
					laHabitacion = new Habitacion(id, tipo, listaCamas, listaAdiciones, capacidad, capacidadKids, precioBase, precioFinal);
					habitaciones.put(id, laHabitacion);
				}
				
				linea = br.readLine(); 
			} 
			br.close();
			
			/*
			System.out.println(habitaciones.keySet());
			System.out.println(habitaciones.get(1).getPrecioFinal());
			System.out.println(habitaciones.get(1).getCapacidad());
			System.out.println(habitaciones.get(1).getCapacidadKids());
			System.out.println(habitaciones.get(3).getPrecioFinal());
			System.out.println(habitaciones.get(3).getCapacidad());
			System.out.println(habitaciones.get(16).getCapacidadKids());*/
			
			return habitaciones;
		}
		
		public static Map<Integer, Habitacion> crearyaniadirHabitacion(Map<Integer, Habitacion> habitacionesadd, String add) throws FileNotFoundException, IOException
		{
				String[] partes = add.split(";");	
				
				int id = Integer.parseInt(partes[0]);
				String tipo = partes[1];
				System.out.println(partes[2]);
				float precioBase = Float.valueOf(partes[2]);
				int capacidad = 0;
				int capacidadKids = 0;
				float precioFinal = precioBase;
				ArrayList<Cama> listaCamas = new ArrayList<>();
				ArrayList<Adicion> listaAdiciones = new ArrayList<>();
				Habitacion laHabitacion = habitacionesadd.get(id);
				String[] camas = partes[3].split(",");
				for (String cama : camas) 
				{
					listaCamas.add(cargarCamas().get(cama));
					capacidad+=cargarCamas().get(cama).getCapacidad();
					precioFinal+=cargarCamas().get(cama).getPrecio();
				}
				
				String[] kids = partes[4].split(",");

				for (String kid : kids) 
				{
					capacidadKids++;
					if (kid!="") 
					{
						capacidadKids++;
					}

				}
				System.out.println("ganzo3");
				
				String[] adiciones = partes[5].split(",");
				
				for (String adicion : adiciones) 
				{
					listaAdiciones.add(cargarAdiciones().get(adicion));
					precioFinal+=cargarAdiciones().get(adicion).getPrecio();
				}
				
				//Crea la habitacion
				if (laHabitacion == null)
				{
					laHabitacion = new Habitacion(id, tipo, listaCamas, listaAdiciones, capacidad, capacidadKids, precioBase, precioFinal);
					habitacionesadd.put(id, laHabitacion);
				}
				
				System.out.println("ganzo4");	
			GuardarCambiosHabitaciones(habitacionesadd);
			return habitacionesadd;
		}
		
		public static void GuardarCambiosHabitaciones(Map<Integer, Habitacion> habitaciones) throws IOException {
			System.out.println("ganzo");
			 for (Map.Entry<Integer,Habitacion> habitacion : habitaciones.entrySet()) {
				 BufferedWriter bw = new BufferedWriter(new FileWriter("habitaciones.txt", true));
				 Habitacion habitacioninf=habitacion.getValue();
				 bw.write(String.valueOf(habitacioninf));
		         bw.newLine();
		         bw.close();
			 }
		         
  }}
