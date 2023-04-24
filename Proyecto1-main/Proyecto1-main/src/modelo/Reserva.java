package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Reserva
{
	String nombre;
    String fechaEntrada;
    String fechaSalida;
    int habitacion;
    int numeroPersonas;
    int numeroNinos;
    CheckInStatus checkIn;
    CheckOutStatus checkOut;
	private int idReserva;
	private LocalDateTime hora;
	private Grupo grupo;
	
	//Generador
	public Reserva(int idReserva, LocalDateTime hora, boolean activa, Grupo grupo,String nombre, String fechaEntrada, String fechaSalida){
	{
		this.idReserva = idReserva;
		this.hora = hora;
		this.grupo = grupo;
	    this.nombre = nombre;
	    this.fechaEntrada = fechaEntrada;
	    this.fechaSalida = fechaSalida;
	    this.habitacion = -1;
	    this.checkIn = CheckInStatus.PENDIENTE_DE_CHECK_IN;
	    this.checkOut = CheckOutStatus.PENDIENTE_DE_CHECK_OUT;
	}

	//Getters and Setters

	
	}}
