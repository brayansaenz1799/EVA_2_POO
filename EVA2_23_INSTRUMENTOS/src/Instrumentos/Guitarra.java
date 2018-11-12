/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Instrumentos;

/**
 *
 * @author temporal2
 */
public class Guitarra extends InstrumentoMusical
implements GuitarraElectrica, GuitarraA {
    private int numeroCuerdas;
    private String efectos;
    private int potencia;
    private String tipoGuitarra;

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    @Override
    public void tocarInstrumento() {
        System.out.println("Rascale!!, guitarra con " +numeroCuerdas);
        System.out.println("La guitarra es de tipo "  );
        System.out.println("Tiene efectos " + efectos);
        System.out.println("Tiene potencia " + potencia );
        System.out.println(tipoGuitarra);
       
    }

    @Override
    public void efectos(String tipoEfecto) {
        efectos = tipoEfecto;
        
    }

    @Override
    public void amplificador(int potencia) {
        this.potencia = potencia;
        
    }

    @Override
    public void tipoGuitarra(String tipo) {
        System.out.println("");
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}

