/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carolina Amaya Muela 18550324
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal aAni = new Animal();
        aAni.movimiento();
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
        Ostra aOstra = new Ostra();
        aOstra.movimiento();
    }
    
}
class Caballo extends Animal{
    @Override
    public void movimiento(){
        System.out.println("Galopar");
    }
    public void movimiento(String sMovil){
        System.out.println(sMovil);
    }

}
class Ostra extends Animal {
}
class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }

}