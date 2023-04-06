package modelo;
import java.util.Scanner;

public class Servicio {
	
	//Atributos 
	
	private float precio;
	private boolean disponibilidad;
	 
	//Constructor
	
	public Servicio(float precio, boolean disponibilidad)
	{
		
		this.precio = precio;
		this.disponibilidad = disponibilidad;
		
	}
	

	public void registrarServicio() {
		
		Scanner sc = new Scanner(System.in);
		boolean continuar = true;
		while(continuar) {
	         System.out.println("1. Registrar servicio en el Spa");
	         System.out.println("2. Registrar servicio en el Restaurante");
	         System.out.println("3. Registrar servicio en Guia Turistica");
	         System.out.println("4. Salir de servicios ");
	         System.out.print("Elija una opción: ");
	         
	         int opcion = sc.nextInt();
	         
	         switch (opcion) {
             case 1:
                 System.out.println("Ha elegido registrar servicio en el spa");
                 
                 Spa nv = new Spa(precio, disponibilidad);
                 
                 nv.nuevoSpa();
                 
                 break;
             case 2:
                 System.out.println("Ha elegido registrar serrvicio en el restaurante");
                 
                 Restaurante rv = new Restaurante(precio, disponibilidad);
                 
                 rv.nuevoRestaurante();
                 
             case 3:
                 System.out.println("Ha elegido registrar servicio en la guia turistica");
                 
                 Guia_Turistica gv = new Guia_Turistica(precio, disponibilidad);
                 
                 gv.nuevaGuia();
                 
                 break;
                 
            case 4:
                 System.out.println("Saliendo del programa.");
                 break;
                 
             default:
                 System.out.println("Opción inválida. Intente de nuevo.");
                 break;
		
		} }
		
		sc.close();
	}
	
	
	//Métodos 
	
	
	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public boolean isDisponibilidad() {
		return disponibilidad;
	}


	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}


	public void registrarPago() {
		
		
	}
	
}
