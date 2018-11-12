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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Área de un cuadro de lado 1010");
        System.out.println(Geometria.calcularAreaCuadro(10));
        Geometria.calcularAreaCuadro(100);
        Geometria gObj = new Geometria();
        
        System.out.println("Área de un triangulo de lado 10*3");
        System.out.println(Geometria.clacularAreaTriangulo(10, 3));
        Geometria.clacularAreaTriangulo(10, 3);
        
        
    }
    
}
class Geometria{
    // Los métodos estaticos existen desde que el programa inicia, y solamente
    // se pueden usar através de la clase a la que pertenece. NO SON INSTANCIABLES
public static double calcularAreaCuadro(double dLAdo)
{
        return dLAdo*dLAdo;
}
public static double clacularAreaTriangulo(double Lado, double altura){
    return Lado * altura;
}


}