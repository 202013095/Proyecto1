package modelo;

import java.time.*;

public class Fecha 
{
	//Atributos
	private LocalDate fechaInit;
	private LocalDate fechaFinit;
	
	//Generador
	public Fecha(int diaInit, int mesInit, int anoInit, int diaFinit, int mesFinit, int anoFinit)
	{
		this.fechaInit = LocalDate.of(anoInit, mesInit, diaInit);
		this.fechaFinit = LocalDate.of(anoFinit, mesFinit, diaFinit);
	}
	//Getters and Setters
	public LocalDate getFechaInit() {
		return fechaInit;
	}
	public void setFechaInit(LocalDate fechaInit) {
		this.fechaInit = fechaInit;
	}
	public LocalDate getFechaFinit() {
		return fechaFinit;
	}
	public void setFechaFinit(LocalDate fechaFinit) {
		this.fechaFinit = fechaFinit;
	}
	
	
	//Metodos
		
}
