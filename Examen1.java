
package examen1;


public class Examen1 {

   
    public static void main(String[] args) {
    
            hilo1 hilito1 = new hilo1("Juan");
            hilo1 hilito2 = new hilo1("Pepe");
            hilo1 hilito3 = new hilo1("Elvira");
           
            
            hilito1.start();
            hilito2.start();
            hilito3.start();
            
                  
            
        
try{
        		hilito1.join();
       		hilito2.join();
        		hilito3.join();
        	
    	}catch(Exception e){
        		System.out.println("Error");
    	}
    	System.out.println("Hilo principal terminado");
	}
    
}







//Programa en java que crea tres hilos y los ejecuta. Los hilos escriben 8 veces el número de iteración del bucle y su nombre. En cada iteración, después de escribir su nombre, se bloquean durante un tiempo aleatorio de segundos y después vuelven a estar disponibles para su ejecución. El programa principal no terminará hasta que hayan terminado los tres hilos. 