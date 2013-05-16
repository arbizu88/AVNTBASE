package practice;


public class AccionesVehiculos extends Thread {

	public AccionesVehiculos(String hilo){
		
		Automotor auto = new Vehiculo();
		
		System.out.println(hilo);
		auto.arrancarMotor();
	/*	auto.acelerarMotor();
		auto.frenarMotor();*/
	}
	
	public void run() {
        for (int i = 0; i < 1 ; i++) 
            System.out.println(i + " " + getName());
       // System.out.println("Termina thread " + getName()  );
        
	}
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AccionesVehiculos("Iniciar el recorrido").start();
		
		
	}

}
