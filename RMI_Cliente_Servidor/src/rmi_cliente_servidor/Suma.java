
package rmi_cliente_servidor;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author rosa isela
 */
public interface Suma extends Remote{
    
    public String  suma(String a, String b) throws RemoteException;
    
}
