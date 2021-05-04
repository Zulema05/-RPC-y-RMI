
package rmi_cliente_servidor;

import java.rmi.Remote;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author rosa isela
 */
public class Servidor {

    public static void main(String[] args) {
        try{
            Registry  r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            
            r.rebind("Suma", (Remote) new Rmi());
            
            JOptionPane.showMessageDialog(null, "Servidor esta en Linea");
        }catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Servidor Fuera de Linea");
        }
    }
    
}
