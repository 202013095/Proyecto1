package modelo;

import java.util.ArrayList;
import java.util.Map;

public class Habitacion 
{
	//Atributos
	private int idHabitacion;
	private String tipoHabitacion;
	private ArrayList<Cama> listaCamas;
	private ArrayList<Adicion> listaAdiciones;
	private ArrayList<String> listaFechas = new ArrayList<>();
	//private Disponible disponibilidad;
	private int capacidad;
	private int capacidadKids;
	private float precioBase;
	private float precioFinal;
	 
	//Generador
	/*Revusar listafechas*/
	public Habitacion(int idHabitacion, String tipoHabitacion, ArrayList<Cama> listaCamas, ArrayList<Adicion> listaAdiciones, ArrayList<String> listaFecha,int capacidad, int capacidadKids, float precioBase, float precioFinal)
	{
		this.idHabitacion = idHabitacion;
		this.tipoHabitacion = tipoHabitacion;
		this.listaCamas = listaCamas;
		this.listaAdiciones = listaAdiciones;
		this.listaFechas = listaFechas;
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

	public ArrayList<String> getListaFechas() {
		return listaFechas;
	}

	public void setListaFechas(ArrayList<String> listaFechas) {
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

	public void cambiarCamas(Map<String, Cama> camas, String info) {
		
		String[] infosplit = info.split(",");
		ArrayList<Cama> listaCamasnew = new ArrayList<>();
		float precioFinalnew = 0;
		int newcapacidad=0;
		
		for (String cama : infosplit) 
		{
			listaCamasnew.add(camas.get(cama));
			newcapacidad+=camas.get(cama).getCapacidad();
			precioFinalnew+=camas.get(cama).getPrecio();
		}
		
		capacidad=newcapacidad;
		float precioAdiciones= precioadiciones();
		
		listaCamas=listaCamasnew;
		precioFinal=precioFinalnew+precioBase+precioAdiciones;
		
	}
	
	public void cambiarAdiciones(Map<String, Adicion> adicion, String info) {
		
		String[] infosplit = info.split(",");
		ArrayList<Adicion> listaAdicionesnew = new ArrayList<>();
		
		float precioFinalnew = 0;
		
		for (String adicioninfo : infosplit) 
		{
			listaAdicionesnew.add(adicion.get(adicioninfo));
			precioFinalnew+=adicion.get(adicioninfo).getPrecio();
		}
		
		float precioCamas= precioCamas();
		
		listaAdiciones=listaAdicionesnew;
		precioFinal=precioFinalnew+precioBase+precioCamas;
		
	}
	
	private float precioadiciones() {
		
		float precioFinalnew = 0;
		for (Adicion adicions : listaAdiciones) 
			
		{
			precioFinalnew+=adicions.getPrecio();
		}
		
		return precioFinalnew; 
	}
	
private float precioCamas() {
		
		float precioFinalnew = 0;
		for (Adicion cama : listaAdiciones) 
			
		{
			precioFinalnew+=cama.getPrecio();
		}
		
		return precioFinalnew; 
	}

public void aumentotarifa(int porcentaje) {
	
	precioFinal=precioFinal+((precioFinal*porcentaje)/100);
	
}

public void descuentotarifa(int porcentaje) {
	
	precioFinal=precioFinal-((precioFinal*porcentaje)/100);
	
}

}

