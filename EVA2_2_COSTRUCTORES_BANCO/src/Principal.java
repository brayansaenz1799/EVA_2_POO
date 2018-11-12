
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bMicuenta = new Banco();
        System.out.println("Nombre del cliente: " + bMicuenta.getNombreCliente());
        System.out.println("Saldo del cliente: " + bMicuenta.getSaldo());
        
        Banco bMicuenta2 = new Banco ("Brayan Salvador", 5000);
        System.out.println("Nombre del cliente: " + bMicuenta2.getNombreCliente());
        System.out.println("Saldo del cliente: " + bMicuenta2.getSaldo());
    }
    
}
class Banco{
    private String nombreCliente;
    private double saldo;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Banco() {
        nombreCliente = "Brayan Saenz";
        saldo = 1000;
    }

    public Banco(String nombreCliente, double saldo) { //sobre carga - overraide
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }
    
}