package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Recepcionista extends Usuario{
	
	String opciones[] = {"1. Gestionar Reservas",
		                 "2. Registrar Huesped o Grupo",
		                 "3. Obtener Factura",
		                 "4. Consultar Habitaciones"
		                 };

	private ArrayList<Reserva> listaReserva;

	public Recepcionista(String login, String password, String nombre, String tipo) {
		super(login, password, nombre, tipo);

		this.listaReserva = new ArrayList<>();;
	}
	
	public String[] ShowOptions() {		
		return opciones;
		
	}

	public Grupo crearGrupo() {

		String nombreTitula = input("Nombre del titular");
		int acompañantesAdultos = Integer.parseInt(input("Numero de acompañantes adultos"));
		int acompañantesNinos = Integer.parseInt(input("Numero de acompañantes niños"));
		ArrayList<Huesped> listaHuespedes = new ArrayList<>();
		int cont = acompañantesAdultos+1;

		while (cont>0){
			Huesped huesped = crearHuesped();
			listaHuespedes.add(huesped);
			cont--;
		}

		Grupo elGrupo = new Grupo(nombreTitula, acompañantesAdultos, acompañantesNinos, listaHuespedes);

		return elGrupo;
	}


	public Huesped crearHuesped(){

		String nombre = input("Nombre");
		int documento= Integer.parseInt(input("Documento"));
		String correo = input("Correo");
		int celular = Integer.parseInt(input("Celular"));
		int edad = Integer.parseInt(input("Edad"));
		int acompañantes = Integer.parseInt(input("Numero de acompañantes"));

		Huesped elHuesped = new Huesped(nombre, documento, correo, celular, acompañantes, edad);

		return elHuesped;
	}

	public Reserva  crearReserva() {

		int idReserva = (int) (Math.random() * 100 + 1);
		Grupo grupo = crearGrupo();
		boolean activa = true;
		LocalDateTime hora = LocalDateTime.now();

		/*Reserva reserva = new Reserva(idReserva, hora, activa, grupo);*/
		
		return reserva;
	}

	//INPUT//
	public String input(String mensaje)
	{
		try	{
				System.out.print(mensaje + ": ");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return reader.readLine();
			}
		catch (IOException e)
			{
				System.out.println("Error leyendo de la consola");
				e.printStackTrace();
			}
		return null;
	}
	
	

}
