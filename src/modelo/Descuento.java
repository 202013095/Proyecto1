package modelo;

public class Descuento extends Fecha{

	//Atributos
	private float descuento;
	
	//Generador
	public Descuento(int diaInit, int mesInit, int anoInit, int diaFinal, int mesFinal, int anoFinal, float descuento) {
		super(diaInit, mesInit, anoInit, diaFinal, mesFinal, anoFinal);
		
		this.descuento = descuento;
	}
	
	//Getters and Setters
	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}
}
