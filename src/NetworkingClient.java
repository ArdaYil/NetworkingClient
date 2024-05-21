/* CLIENT */
import java.io.*;
import java.net.*;

public class NetworkingClient {

    public static void main(String args[]) {

        Socket client = null;

        // Vi tar samma default port som servern och annars tar in porten som en inparameter
        int portnumber = 8080;
        if (args.length >= 1){
            portnumber = Integer.parseInt(args[0]);
        }

        // Vi loopar 10 gånger
        for (int i=0; i <10; i++) {
            try {
                String msg = "";

                // Skapa klient
                client = new Socket(InetAddress.getLocalHost(), portnumber);
                System.out.println("Client socket is created " + client);

                // Skapa en ström för klienten
                OutputStream clientOut = client.getOutputStream();
                PrintWriter pw = new PrintWriter(clientOut, true);

            } catch (IOException ie) {
                System.out.println("I/O error " + ie);
            }
        }
    }
}