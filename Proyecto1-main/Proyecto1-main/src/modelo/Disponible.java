package modelo;

public class Disponible extends Fecha{

	//Atributos
	private boolean disponible;

	//Generador
	public Disponible(int diaInit, int mesInit, int anoInit, int diaFinit, int mesFinit, int anoFinit, boolean disponible) {
		super(diaInit, mesInit, anoInit, diaFinit, mesFinit, anoFinit);
		
		this.disponible = disponible;
	}

	//Getters and Setters
	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
}
