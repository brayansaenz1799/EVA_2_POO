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
        Ostra oPalCocktail = new Ostra();
        oPalCocktail.movimiento();
    }
    
}
// Final ya no se puede heredar de Ostra 
class Almejas extends Animal{
}
final class Ostra extends Animal{
}
abstract class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");}
}