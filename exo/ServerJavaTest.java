package fr.afpa.exo;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerJavaTest {
	public static void  server() {

		try (ServerSocket serverSocket = new ServerSocket(9999)) {
			Socket connectionSocket = serverSocket.accept();
		} catch (Exception e) {
		    System.out.println("server pas ok " + e);
		}
	}
}
