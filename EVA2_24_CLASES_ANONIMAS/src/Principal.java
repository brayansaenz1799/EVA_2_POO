/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina Amaya Muela
 */
public class Principal implements ImprimirMensaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal mObj = new Principal();
        mObj.imprimirMensaje("hola");
        //ImprimirMensaje es una interfaz no se pueden crear objetos de interfaces
        //Crear una clase anónima que implementa los métodos de la interfaz
        
        ImprimirMensaje objImprimir = new ImprimirMensaje(){

            @Override
            public void imprimirMensaje(String sMensa) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        objImprimir.imprimirMensaje("Carolina");
    }

    @Override
    public void imprimirMensaje(String sMensa) {
        System.out.println("Hola " + sMensa);
    }
    
}
interface ImprimirMensaje{
public void imprimirMensaje(String sMensa);
}