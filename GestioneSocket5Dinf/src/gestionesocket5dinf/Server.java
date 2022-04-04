
package gestionesocket5dinf;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Server 
{
        public static void main (String[] args)
        {
            try {
                ServerSocket serversocket= new ServerSocket(2000);
                //istanza della classe java.net.ServerSocket con laporta su cui rimanere in ascolto.
                System.out.println("Server aperto correttamente");
                Socket socket= serversocket.accept();
                 /* il metodo accept()  fa in modo che il server rimanga in ascolto di una richiesta 
                da parte del client*/
                System.out.println("Connessione riuscita");
                System.out.println("Socket:"+socket);
                socket.close();
            }   catch(BindException ex)
                {
                    System.err.println("Porta occupata");
                }
            
                
                catch (IOException ex) 
                {
                System.err.println("Errore avvio server");
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    
}
