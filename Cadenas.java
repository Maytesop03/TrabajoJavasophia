package arreglos;
import java.util.*;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  String [] nombres;  //Declaracion de un arreglo
  String [] estados = new String[100]; //
		estados[0] = "Jalisco";
		
		Scanner sc = new Scanner(System.in);  
		System.out.println("Cuantos quieres almacenar");
		int elementos = sc.nextInt(); 
		nombres = new String[elementos];
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("nombre:" + i);
			nombres[i] = sc.nextLine(); 
			
		 
		
		}
		for(String nombre : nombres) {
			System.out.println(nombre); 
			
			
		}
		
		}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
		                                                                                                                                                                                                                             
	}

