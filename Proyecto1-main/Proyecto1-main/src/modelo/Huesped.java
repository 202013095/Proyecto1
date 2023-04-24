package modelo;

public class Huesped 
{
	//Atributos
	private String nombre;
	private int documento;
	private String correo;
	private int celular;
	private int acompanantes;
	private int edad;
	//private Grupo grupo;
	
	//Generador
	public Huesped(String nombre, int documento, String correo, int celular, int acompanantes, int edad)  
	{
		this.nombre = nombre;
		this.documento = documento;
		this.correo = correo;
		this.celular = celular;
		this.acompanantes = acompanantes;
		this.edad =  edad;
		//this.grupo =  grupo;
	}
	
//	public Grupo getGrupo() {
//		return grupo;
//	}

//	public void setGrupo(Grupo grupo) {
//		this.grupo = grupo;
//	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	public int getAcompanantes() {
		return acompanantes;
	}

	public void setAcompanantes(int acompanantes) {
		this.acompanantes = acompanantes;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Métodos sobrecargados de una superclase
	@Override
	public boolean equals(Object obj)
	{
		if (obj.getClass() != this.getClass())
			return false;
		else
		{
			Huesped otro = (Huesped) obj;
			return this.nombre.equals(otro.nombre);
		}
	}

	@Override
	public int hashCode()
	{
		return nombre.hashCode();
	}

	@Override
	public String toString()
	{
		return nombre;
	}	
		
}
