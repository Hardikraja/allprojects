package nsprogram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.logging.SocketHandler;

public class Client {
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;

    public  Client(String address, int port)
    {
        try{

            socket = new Socket(address,port);
            System.out.println("connected");

            input = new DataInputStream(System.in);

            out = new DataOutputStream(socket.getOutputStream());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        String line = "";

        while(!line.equals("over")){
            try{
                line = input.readLine();
                out.writeUTF(line);
            }
            catch (Exception e)
            {
                System.out.println("error");
            }
        }

        try{
            input.close();
            out.close();
            socket.close();
        }
        catch (Exception e)
        {
            System.out.println("error..");
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1",5000);
    }
}
