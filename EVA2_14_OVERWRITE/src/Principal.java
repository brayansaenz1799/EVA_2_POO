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
        Animal aAni = new Animal();
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero("pararse");
       
    }
    
}
class Mamifero extends Animal{
    public Mamifero(){
        // lo primero es llamar al constructor de la clase base(animal)
        super();
    }
    public Mamifero(String accion){
    super(accion);
        System.out.println("Y salir corriendo");
    }
}
class Animal{
    public Animal(){
        System.out.println("Respirando");
    }
    public Animal (String accion){
        System.out.println("Respirar y " + accion);
    }
    
}
