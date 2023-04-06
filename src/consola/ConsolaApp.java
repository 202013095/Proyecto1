package consola;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import Procesamiento.Hotel;

public class ConsolaApp{

		private static Hotel hotel;

		public void ejecutarAplicacion() throws FileNotFoundException, IOException
		{


			System.out.println("Bienvenido a Hotel Manager\n");

			boolean continuar = true;
			while (continuar)
			{
				try
				{
					mostrarOpciones();
					
					int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
					
					if (opcion_seleccionada == 1 && hotel != null) {
						
						String log = input("USUARIO");
						String pass = input("CONTRASENA");
						
						if (hotel.comparelogin(log, pass)!=null) {
						    System.out.println("Bienvenido "+hotel.comparelogin(log, pass));
						    
						    int manushow = hotel.conocerUsuario();
						    boolean opcion2 =true;
						    
						    /*MENU ADMINISTRADOR*/
						    if (manushow==1) {
						    	
						    	while (opcion2) {
						    
						    System.out.println("Que desea realizar?");
						    String[] opciones = hotel.mostrarMenu();
						    continuar=false;
						    for (int i = 0; i < opciones.length; i++) {
						    	  System.out.println(opciones[i]);
						    	}
						    
						    /*Seleccionar Menu*/ 
						    
						    int opcion_selec= Integer.parseInt(input("Por favor seleccione una opción"));
						    
						    if (opcion_selec>opciones.length) {
						    	ejecutarAplicacion();
						    }
						    
						    else {
						    	if (opcion_selec==6){	
						    		String info= input("Ingrese el numero de habitacion");
						    		info+=(";")+input("Ingrese el tipo de habitacion (estandar,suite,doblesuite)");
						    		info+=(";")+input("Ingrese precio base");
						    		info+=(";")+input("Ingrese las camas separadas por una coma (King, Queen, Doble, Sencilla, Kids)");
						    		
						    		int imput= Integer.parseInt(input("Ingrese el numero de camas para ninos"));
						    		info+=(";");
						    		for (int i=0; i<imput; i++) {
						    			info+="Kids,";
						    		}
						    		info+=(";")+input("Ingrese las adiciones de la habitacion por una coma (Balcon,TV,Escritorio,Nevera,Cafetera,Cocina privada,Parkeadero,Pet-friendly,Vista a la playa,Vista a la ciudad");
						    		String ejecucionmensaje=hotel.crearHabitacion(info);
						    		
						    	}
						    	
						    	
						    }}}
						    
						    /*MENU RECEPCIONISTA*/
						
						    else if (manushow==2) {
						    	
						    	while (opcion2) {
							    
							    System.out.println("Que desea realizar?");
							    String[] opciones = hotel.mostrarMenu();
							    continuar=false;
							    for (int i = 0; i < opciones.length; i++) {
							    	  System.out.println(opciones[i]);
							    	}
							    
							    /*Seleccionar Menu*/ 
							    
							    int opcion_selec= Integer.parseInt(input("Por favor seleccione una opción"));
							    
							    if (opcion_selec>opciones.length) {
							    	ejecutarAplicacion();
							    }
							    
							    else {
							    	hotel.OpcionesRecepcionista(opcion_selec);
								    	}
							    }}
						    
						    /*MENU EMPLEADO*/
						
						     else if (manushow==3) {
						    	
						    	while (opcion2) {
							    
							    System.out.println("Que desea realizar?");
							    String[] opciones = hotel.mostrarMenu();
							    continuar=false;
							    for (int i = 0; i < opciones.length; i++) {
							    	  System.out.println(opciones[i]);
							    	}
							    
							    /*Seleccionar Menu*/ 
							    
							    int opcion_selec= Integer.parseInt(input("Por favor seleccione una opción"));
							    
							    if (opcion_selec>opciones.length-1) {
							    	ejecutarAplicacion();
							    }
							    
							    else {
							    	hotel.OpcionesEmpleado(opcion_selec);
								    	}
							    }
						    	
						     }}
						}
						
					
					if (opcion_seleccionada == 2 && hotel!= null) {
						
						/*Se puede desarrollar pero no es prioridad, toca pedir algun permiso de administrador o cualquiera puede crear el usuario?*/
						
					}
					
					
					else if (opcion_seleccionada == 3 && hotel != null)
					{
						System.out.println("Saliendo de la aplicación ...");
						continuar = false;
					}
					
					else
					{
						System.out.println("Por favor seleccione una opción válida.");
					}}
				
				
				catch (NumberFormatException e)
				{
					System.out.println("Debe seleccionar uno de los números de las opciones.");
				
				}}}
	


		/*MENU PRINT INICIO*/
		
		public void mostrarOpciones()
		{
			System.out.println("\n OPCIONES DE HOTEL MANAGER\n");
			System.out.println("1. Ingresar LOGIN");
			System.out.println("2. Crear Usuario SINGUP");
			System.out.println("3. Salir");
		}


		private static void CargarInventarioUsuarios(Hotel hotel) throws FileNotFoundException, IOException
		{
			System.out.println("\n" + "Cargando Inventario y Usuarios" + "\n");

			{
				hotel.cargarInventarios();
				System.out.println("Informacion cargada con exito");
				
			}}
		
			/*METODO MAIN*/
			
			
			public static void main(String[] args) throws IOException
			{
				ConsolaApp consola = new ConsolaApp();
				hotel = new Hotel();
				
				CargarInventarioUsuarios(hotel);
				
				consola.ejecutarAplicacion();	
			}
			

		    /*INPUT*/
			public String input(String mensaje)
				{
					try
					{
						System.out.print(mensaje + ": ");
						BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
						return reader.readLine();
					}
					catch (IOException e)
					{
						System.out.println("Error leyendo de la consola");
						e.printStackTrace();
					}
					return null;
				}
			}

		

		
		


