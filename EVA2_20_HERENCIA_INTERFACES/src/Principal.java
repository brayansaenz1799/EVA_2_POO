/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina Amaya Muela 18550324
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hijo hOb = new Hijo();
        hOb.Algo();
        hOb.mensaje();
        hOb.OtroMEnsaje();
    }
    
}
class Hijo extends Padre implements Accesorio, AlgoMas{

    @Override
    public void mensaje() {
        System.out.println("Hola");
    }

    @Override
    public void OtroMEnsaje() {
        System.out.println("Adiós");
       
    }
}
class Padre{
public void Algo(){
    System.out.println("Mensaje de la clase base");
}
}

interface Accesorio{
public void mensaje();
}
interface AlgoMas{
public void OtroMEnsaje();
}