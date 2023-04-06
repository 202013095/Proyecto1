package modelo;

public class Usuario 
{
	//Atributos
	private String login;
	private String password;
	private String nombre;
	private String tipoUsuario;
	//public Calendar calendario= new GregorianCalendar();
	
	//Generador
	public Usuario(String login, String password, String nombre, String usuario)
	{
		this.login = login;
		this.password = password;
		this.nombre = nombre;
		this.tipoUsuario = usuario;
	}

	//Getters and Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
	
	public String getUsuario() {
		return this.tipoUsuario;
	}

	public void setUsuario(String usuario) {
		this.tipoUsuario = usuario;
	}
	
	public String[] ShowOptions() {
		return null;	
	}
	
	public static String[] ReturnOptionInput(int input) {	
		return null;
	}
}
