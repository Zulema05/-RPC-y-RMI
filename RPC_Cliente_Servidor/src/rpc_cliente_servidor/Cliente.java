
package rpc_cliente_servidor;

import java.util.Vector;
import javax.swing.JOptionPane;
import org.apache.xmlrpc.XmlRpcClient;
/**
 *
 * @author rosa isela
 */
public class Cliente {

    public static void main(String[] args) {
        String x="", y="";
        Object resultado; 
        
        try{
            XmlRpcClient cliente  = new XmlRpcClient ("http://192.168.10.248:8080");
            Vector<String> parametros = new Vector<String>();
            
            JOptionPane.showMessageDialog(null, "El cliente se ha conectado");
            
           while (true){
               String menu = JOptionPane.showInputDialog(null, "Suma de 2 numeros\n"
                       + "1.- Sumar\n"
                       + "2.- Salir\n", "Cliente Servidor RPC", JOptionPane.DEFAULT_OPTION);
               
               switch (menu ){
                   case "1":
                       x = JOptionPane.showInputDialog(null, "Primer numero", "Suma", JOptionPane.QUESTION_MESSAGE);
                       y = JOptionPane.showInputDialog(null, "Segundo numero", "Suma", JOptionPane.QUESTION_MESSAGE);
                       
                       parametros.addElement(x);
                       parametros.addElement(y);
                       
                       resultado = cliente.execute("miServidorRPC.suma", parametros);
                       
                       JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
                       
                       parametros.clear();
                       break;
                   case "2":
                        JOptionPane.showMessageDialog(null, "Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        break;
               }
               
           }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
    
}
