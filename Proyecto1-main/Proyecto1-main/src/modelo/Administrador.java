package modelo;

public class Administrador extends Usuario{
	
	/*Atributes*/
	

	String opciones[] = {"GESTIONAR HABITACIONES",
			"1. Agregar descuento o aumento en tarifa de todas las habitaciones",
            "2. Modificar precio base de una habitacion",
            "3. Modificar adiciones de una habitacion",
            "4. Modificar camas de una habitacion",
            "5. Agregar habitacion", 
			"GESTIONAR PROMOCIONES Y DESCUENTOS",
			"6. Modificar tarifas de temporada",
            "7. Agregar tarifas temporada",
            "8. Eliminar tarifas de temporada",
            "9 .Agregar descuento por rango de fechas",
			"GESTIONAR SERVICIOS",
			"10 .Agregar Servicio",
            "11 .Eliminar servicio",
			"SALIR Y GUARDAR CAMBIOS",
			"12 .Salir"};
			             

	public Administrador(String login, String password, String nombre, String usuario) {
		super(login, password, nombre, usuario);
		// TODO Auto-generated constructor stub
	}

	public String[] ShowOptions() {		
		return opciones;
		
	}
	
	
	
	/*Falta Implementacion: Eliminar los prints*/
	public static void modificarPrecioHabitaciones() {
		
		System.out.println("Precio modificado exitosamente");
	}
	
	public static  void modificarPrecioUnaHabitacion() {
    	
    	System.out.println("Precio de la habitacion xx modificado exitosamente");
    }
	
	public static  void AdicionesHabitaciones() {
    	System.out.println("Habitacion editada correctamente");
    }
    
	public static  void CamasEnHabitacines() {
    	System.out.println("Habitacion editada correctamente");
    }
    
	public static  void PrecioHabitaciones() {
    	System.out.println("Precio editado correctamente");   
    }
    
	public static  void AgrgarHabitacion() {
    	System.out.println("Habitacion agregada exitosamente");
    }
    
	public static  void GuardarCambios() {
    	System.out.println("Cambios guardados de manera exitosa");
    }
    	
    
    }
	

