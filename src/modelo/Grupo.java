package modelo;

import java.util.ArrayList;

public class Grupo 
{
	//Atributos
	private String nombreTitular;
	private int numeroPersonas;
	private int numeroNinos;
	private ArrayList<Huesped> listaHuespedes;
	
	//Generador
	public Grupo(String nombreTitular, int numeroPersonas, int numeroNinos, ArrayList<Huesped> listaHuespedes)
	{
		this.nombreTitular = nombreTitular;
		this.numeroPersonas = numeroPersonas;
		this.numeroNinos = numeroNinos;
		this.listaHuespedes = listaHuespedes;
	}

	//Getters and Setters
	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public int getNumeroNinos() {
		return numeroNinos;
	}

	public void setNumeroNinos(int numeroNinos) {
		this.numeroNinos = numeroNinos;
	}	
	
	public void agregarHuesped(Huesped huesped)
	{
		listaHuespedes.add(huesped);
	}
	
	public ArrayList<Huesped> darListaHuespedes(){
		return listaHuespedes;
	}
	
	// Métodos sobrecargados de una superclase
	@Override
	public boolean equals(Object obj)
	{
		if (obj.getClass() != this.getClass())
			return false;
		else
		{
			Grupo otro = (Grupo) obj;
			return this.nombreTitular.equals(otro.nombreTitular);
		}
	}

	@Override
	public int hashCode()
	{
		return nombreTitular.hashCode();
	}

	@Override
	public String toString()
	{
		return nombreTitular;
	}	
	
}
