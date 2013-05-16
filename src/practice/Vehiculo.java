package practice;

//
/* Aqui estoy implementando la interface Automotor
 * 
 * 
 */
public class Vehiculo implements Automotor {
	
	public void arrancarMotor(){
		
	    System.out.println("Encender el motor");
	}
	
		
    public void acelerarMotor(){
		
		System.out.println("Poner en marcha el motor");
	}
  
    
    public void frenarMotor(){
		
		System.out.println( "Detener el de motor");
		
	}

    
    
}

