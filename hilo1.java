
package examen1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class hilo1 extends Thread{
    public hilo1 (String nombre){
        super(nombre);
    }
    @Override
    public void run(){
       int aleatorio = 100 + (int)(Math.random()*1000);
     for( int i=0; i<8 ; i++){
        System.out.println(" nombre: " +getName() + "; i=" + i);
           try {
               sleep(aleatorio);
           } catch (InterruptedException ex) {
               System.out.println("proceso terminado");
           }
         
         
     }
    System.out.println("El hilo " + getName() + " Ha terminado");
}
    
    
    
}
