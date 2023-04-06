package modelo;

import java.util.ArrayList;

public class Habitacion 
{
	//Atributos
	private int idHabitacion;
	private String tipoHabitacion;
	private ArrayList<Cama> listaCamas;
	private ArrayList<Adicion> listaAdiciones;
	private ArrayList<Fecha> listaFechas;
	//private Disponible disponibilidad;
	private int capacidad;
	private int capacidadKids;
	private float precioBase;
	private float precioFinal;
	 
	//Generador
	public Habitacion(int idHabitacion, String tipoHabitacion, ArrayList<Cama> listaCamas, ArrayList<Adicion> listaAdiciones, int capacidad, int capacidadKids, float precioBase, float precioFinal)
	{
		this.idHabitacion = idHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.listaCamas = listaCamas;
		this.listaAdiciones = listaAdiciones;
		this.listaFechas = new ArrayList<Fecha>();
		//this.disponibilidad = disponibilidad;
		this.capacidad = capacidad;
		this.capacidadKids = capacidadKids;
		this.precioBase = precioBase;
		this.precioFinal = precioFinal;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(float precioBase) {
		this.precioBase = precioBase;
	}

	//Getters and Setters
	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	public ArrayList<Cama> getListaCamas() {
		return listaCamas;
	}

	public void setListaCamas(ArrayList<Cama> listaCamas) {
		this.listaCamas = listaCamas;
	}

	public ArrayList<Adicion> getListaAdiciones() {
		return listaAdiciones;
	}

	public void setListaAdiciones(ArrayList<Adicion> listaAdiciones) {
		this.listaAdiciones = listaAdiciones;
	}
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(float precioFinal) {
		this.precioFinal = precioFinal;
	}

	public int getCapacidadKids() {
		return capacidadKids;
	}

	public void setCapacidadKids(int capacidadKids) {
		this.capacidadKids = capacidadKids;
	}

	public ArrayList<Fecha> getListaFechas() {
		return listaFechas;
	}

	public void setListaFechas(ArrayList<Fecha> listaFechas) {
		this.listaFechas = listaFechas;
	}

//	public Disponible getDisponibilidad() {
//		return disponibilidad;
//	}
//
//	public void setDisponibilidad(Disponible disponibilidad) {
//		this.disponibilidad = disponibilidad;
//	}	
	
	//Metodos	
	public String decirHola()
	{
		return "hola";
	}
}
