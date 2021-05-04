package rpc_servidor_cliente;

import javax.swing.JOptionPane;
import org.apache.xmlrpc.WebServer;

/**
 *
 * @author rosa isela
 */
public class Servidor {

    public static void main(String[] args) {
        try {
            JOptionPane.showMessageDialog(null, "Iniciando el Servidor");
           
           WebServer server = new WebServer(8080);
           
           Suma suma = new Suma();
           
           server.addHandler("miServidorRPC", suma);
           
           server.start();
        
           JOptionPane.showMessageDialog(null,"Servidor en Linea");
        } catch (Exception e){
              JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }
    }
    
}
