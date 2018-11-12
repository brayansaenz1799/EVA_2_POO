public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Operaciones oObj = new Operaciones();
        System.out.println("La suma de 5 + 7 es " + oObj.suma(5, 7));
        System.out.println("La suma de Juan y Peres es " + oObj.suma("Juan", "Peres"));
        System.out.println("True AND false es " + oObj.suma(true, false));
        
        
    }
    class Operaciones{
        public int suma (int Val1, int Val2){
            return Val1 + Val2;
            
        }
        public String suma(String aVal1, String aVal2){
            return aVal1 + aVal2;
        }
        public boolean suma(boolean bVal1, boolean bVal2){
        return bVal1 && bVal2;
        
    }
    }
    
}
