
import MisVehiculos.vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Caroliona Amaya Muela 18550324
 */
public class Principal {

    /**
     * @param args the command line arguments
     * @return 
     */
    public static int main(String[] args) {
        // TODO code application logic here
        vehiculo vCarro = new vehiculo("FORD", "F-150", 2017, 8);
         vCarro.imprimirDatos();
         if(!vCarro.isEstaEncendido()){
             // Verfificamos si el auto está encendido, si no está encendido
             // lo prendemos 
             vCarro.prender(); //Lo arrancamos
         }
   vCarro.acelerar();
        System.out.println("Vasa fabulosos " + vCarro.getVelocidad()+ "km/hr");
        System.out.println();
        
        vCarro.acelerar();
            int velocidad;
            int vel = 0;
            velocidad = 10;
            if(vCarro.isEstaEncendido());{
    if(velocidad >=10)
        vel = 10 + velocidad;
    return vel;
        
    }
            
       
            
}
}
    
    
        
        
        
 
