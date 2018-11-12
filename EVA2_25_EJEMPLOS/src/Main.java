/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones objOp = new Operaciones() {

            @Override
            public int suma(int val1, int val2) {
                return val1 + val2;
                
            }

            @Override
            public String suma(String cade1, String cade2) {
                return cade1 + cade2;
               
            }

            @Override
            public boolean suma(boolean bol1, boolean bol2) {
                return bol1 && bol2;
                
            }
        };
        System.out.println(objOp.suma("mundo", "cruel"));
        System.out.println(objOp.suma(5, 6));
        
        
    }
    
}
interface Operaciones{
public int suma(int val1, int val2);
public String suma(String cade1, String cade2);
public boolean suma(boolean bol1, boolean bol2);
}