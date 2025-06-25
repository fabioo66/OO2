package ar.edu.unlp.objetos.dos.ejercicio1;

import java.io.PrintWriter;

public class EchoServer extends SingleThreadTCPServer {
   
    public void handleMessage(String message, PrintWriter out) {
        out.println(message);
    }

    public static void main(String[] args) {

        new EchoServer().startLoop(args);

    }
   
    @Override
    protected boolean disconnectServer(String inputLine) {
		return (inputLine.equalsIgnoreCase(":-)"));
	}

}