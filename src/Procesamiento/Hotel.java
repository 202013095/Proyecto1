package Procesamiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import modelo.Adicion;
import modelo.Administrador;
import modelo.Cama;
import modelo.Habitacion;
import modelo.Usuario;

	public class Hotel
	{

		/*Attributes*/
		
		private Map <Integer, Habitacion> habitaciones;

		private ArrayList <Usuario> usuario;

		private Map <String, Adicion> adicion;
		
		private Usuario ActualUser;
		
		private Map<String, Cama> camas;

		/*Constructors*/
		
		public Hotel ()
		{
			this.habitaciones = null;
			this.usuario = null;
			this.adicion= null;
			this.camas= null;
		}

		/*Methods*/
		
		/*Carga de Inventarios*/
		public void cargarInventarios () throws FileNotFoundException, IOException{
			
			usuario= Loader.cargarUsuarios();
			adicion= Loader.cargarAdiciones();
			camas=Loader.cargarCamas();
			habitaciones=Loader.cargarHabitaciones();
			
		}
		
		/*Login*/
		public String comparelogin(String logininput, String pass) {
			String booli= null;
			
			for (int i = 0; i < usuario.size(); i++) {
				Usuario userinfo =usuario.get(i);
				if ((userinfo.getLogin().equals(logininput))&(userinfo.getPassword().equals(pass))){
					booli= userinfo.getNombre();
					ActualUser=userinfo;
				}
			}
			return booli;
		}
		
		/*Mostrar opciones USUARIOS*/
		
		public int conocerUsuario() {
			int menu=0;
			if (ActualUser.getUsuario().equals("admin")){
				menu=1;
			}
			else if (ActualUser.getUsuario().equals("recepcionista")){
				menu=2;
			}
			else if (ActualUser.getUsuario().equals("empleado")){
				menu=3;
			}
			return menu;
		}
		
		public String[] mostrarMenu() {
			return ActualUser.ShowOptions();
			
		}
	
		
	public void OpcionesRecepcionista (int input){ 
			
			if (input==1) {	
				System.out.println("Falta implementacion");
			}
			else if (input==2) {	
				System.out.println("Falta implementacion");
			}
			
			else if (input==3) {
				System.out.println("Falta implementacion");
			}
			else if (input==4) {
				System.out.println("Falta implementacion");
			}
			else if (input==5) {
				System.out.println("Falta implementacion");
	
			}
			else if (input==6) {	
				System.out.println("Falta implementacion");
			}
			else if (input==7) {
				System.out.println("Falta implementacion");
			}
			else if (input==8) {
				System.out.println("Falta implementacion");
			}
			
		}
	
	public void OpcionesEmpleado (int input){ 
		
		if (input==1) {	
			System.out.println("Falta implementacion");
		}
		else if (input==2) {	
			System.out.println("Falta implementacion");
		}
		
		else if (input==3) {
			System.out.println("Falta implementacion");
		}
		else if (input==4) {
			System.out.println("Falta implementacion");
		}
		else if (input==5) {
			System.out.println("Falta implementacion");

		}
		else if (input==6) {
			System.out.println("Falta implementacion");
		}
		else if (input==7) {
			System.out.println("Falta implementacion");
		}
		else if (input==8) {	
			System.out.println("Falta implementacion");
		}
		
	}
	
	/*FUNCIONES ADMINISTRADOR*/
	
/*cambiarPrecioBaseHabitacion(info)*/
	
public String cambiarPrecioBaseHabitacion(String info, String precio) {
	
	camas.get(info).setPrecio(Integer.parseInt(precio));
	String ejecucion="El cambio de precio de la cama"+info+"se realizo de manera exitosa.";
	return ejecucion;
}
	
/*Cambiar Cama de una adiciones*/
	
	public String cambiarAdiciones(String info, String info2) {
		
		String ejecucion="La habitacion que usted busca no existe en el hotel";
		for (Map.Entry<Integer,Habitacion> habitacion : habitaciones.entrySet()) {
			if (habitacion.getKey().equals(Integer.parseInt(info))) {
				habitacion.getValue().cambiarAdiciones(adicion,info2);
				ejecucion="Se cambiaron las camas de manera exitosa";	
				break;
			}
			}
		return ejecucion;}
	
	/*Cambiar Cama de una habitacion*/
	
	public String cambiarCamas(String info, String info2) {
		
		String ejecucion="La habitacion que usted busca no existe en el hotel";
		for (Map.Entry<Integer,Habitacion> habitacion : habitaciones.entrySet()) {
			if (habitacion.getKey().equals(Integer.parseInt(info))) {
				habitacion.getValue().cambiarCamas(camas,info2);
				ejecucion="Se cambiaron las camas de manera exitosa";	
				break;
			}
			}
		return ejecucion;}
	
	/*Agregar Habitacion*/
	
	public String crearHabitacion(String info) throws FileNotFoundException, IOException {
		
		habitaciones = Loader.crearyaniadirHabitacion(habitaciones, info);
		
		System.out.println("Habitacion creada con exito");
		return "Habitacion creada con exito";
		
	}

	public String cambiarPrecioHabitaciones(String precio) {
		String ejecucion="La habitacion que usted busca no existe en el hotel";
		for (Map.Entry<Integer,Habitacion> habitacion : habitaciones.entrySet()) {
			if (Integer.parseInt(precio)>0) {
				habitacion.getValue().aumentotarifa(Integer.parseInt(ejecucion));
			}
			else {
				habitacion.getValue().descuentotarifa(Integer.parseInt(ejecucion));
			}
	}
		return ejecucion;}
		
		
	

	}

	}
	



