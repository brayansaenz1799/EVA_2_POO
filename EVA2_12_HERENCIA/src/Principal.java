
import Mis_Clases.Clientes;
import Mis_Clases.Persona;
import Mis_Clases.Empelados;


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
        Persona pObj = new Persona();
        /*pObj.setNombre("Carolina");
        pObj.setApellido("Amaya");
        pObj.setEstadoCivil(EstadoCivil.VIUDO);*/
        System.out.println("Persona");
        System.out.println(pObj.getNombre() + " " + pObj.getApellido() + " " + pObj.getDireccion()+ " " + pObj.getEstadoCivil()+ " ");
        
        Empelados eEmp = new Empelados();
        System.out.println("Empleados");
        System.out.println(eEmp.getNombre() + " " + eEmp.getApellido() + " " + eEmp.getSalario()+ " " + eEmp.getEstadoCivil()+ " ");
        /*eEmp.setNombre("Carolina");
        eEmp.setApellido("Amaya");
        eEmp.setEstadoCivil(EstadoCivil.VIUDO);
        eEmp.setSalario(10);*/
        
        
        
        Clientes cCliente = new Clientes();
        System.out.println("Clientes");
       System.out.println(cCliente.getNombre() + " " + cCliente.getApellido() + " " + cCliente.getRFC()+ " ");
        /*cCliente.setNombre("Juan");
        cCliente.setRFC("asdfg245790");*/
        
        
        
        
        
        
    }
    
}
