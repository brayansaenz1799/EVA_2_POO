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
public class Guitarra1 extends InstrumentoMusical{
    
 private int numeroCuerdas;

    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }

    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
 
    @Override
    public void tocarInstrumento() {
        System.out.println("Toca las cuerdas " + numeroCuerdas );
        
    }
    
}
