/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ana Carolina Amaya Muela 18550324
 */
public class Principal {
    int iValor; 
    public Principal(){
    iValor = 10;
    }

    /**
     * @param args the command line arguments
     */
    static String sMensaje = "Hola";
    public static void main(String[] args) {
        // TODO code application logic here
        Principal pObj = new Principal();
        pObj.imprimir();
        pObj.imprimir2(10000);
        String sMensaje = "nada de nada";
        System.out.println(sMensaje);
        //No se puede declarar una variable dos veces 
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            
        }
       for (int i = 0; i < 10; i++) {
            
        }
    } // aquí muere todo, es cuando se termina de ejecutar el main
    public void imprimir(){
        System.out.println("Valor = " +iValor);
    
    }
     public void imprimir2(int iValor){
        System.out.println("Valor = " +iValor);
        System.out.println("Valor del atrbuto: " + this.iValor);
        // this es una palabra reservada se usa para acceder a los miembros de la clase
        // Apuntador de instancia actual de la clase
        
    
    }
}
