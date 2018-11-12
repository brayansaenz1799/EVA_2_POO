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
    }
   
    
    }

    
class Algo{
private Punto Esq;

    public Punto getEsq() {
        return Esq;
    }

    public void setEsq(Punto Esq) {
        this.Esq = Esq;
    }

}
abstract class FiguraGeometrica{
abstract public void EsqIz();
abstract public void color();
abstract public void ancho();
public void calcularArea(){

}
}