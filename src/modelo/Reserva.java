package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva
{
	//Atributos
	private int idReserva;
	private LocalDateTime hora;
	private boolean activa;
	private Grupo grupo;
	
	//Generador
	public Reserva(int idReserva, LocalDateTime hora, boolean activa, Grupo grupo)
	{
		this.idReserva = idReserva;
		this.hora = hora;
		this.activa = activa;
		this.grupo = grupo;
	}

	//Getters and Setters

	
}
