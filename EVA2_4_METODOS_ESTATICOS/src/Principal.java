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
     Operaciones Obj = new Operaciones();
        System.out.println("Hola ");
        System.out.println(Math.cos(50));
        
        
        
    }  
        
    }

    class Operaciones{
        int Valor = 100;
        
    public static  int suma(int iVal1, int iVal2){
        return iVal1+iVal2;
    }
    public static String suma(String sVal1, String sVal2){
        return sVal1 + sVal2;
    }
    public static boolean suma (boolean Val1,boolean Val2){
        return Val1&&Val2;
    }
}

