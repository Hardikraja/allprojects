package nsprogram;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Server {

    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;

    public Server(int port){
        try{
            server = new ServerSocket(port);
            System.out.println("server socket");

            System.out.println("Waiting for a client...");

            socket = server.accept();
            System.out.println("client accepted");

            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            String line ="";

            while(!line.equals("Over")){
                try{
                    line = in.readUTF();
                    System.out.println(line);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
            System.out.println("Closing connection");

            socket.close();
            in.close();
        }catch (Exception i)
        {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
