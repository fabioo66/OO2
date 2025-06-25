package ar.edu.unlp.objetos.dos.ejercicio1;

import java.io.PrintWriter;

public class RepeatServer extends SingleThreadTCPServer {

    @Override
	public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" "); // Divide la línea por los espacios

        if (args.length < 2 || args[0].isEmpty() || !isPositiveInteger(args[1])) {
            out.println("Error: formato incorrecto. Envia al menos dos argumentos: el string a repetir y un número entero mayor a 0.");
            return;
        }

        String stringToRepeat = args[0];
        int repeatCount = Integer.parseInt(args[1]);
        String delimiter = (args.length > 2) ? args[2] : " "; // Si hay un tercer argumento, lo usa como delimitador, sino usa espacio

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeatCount; i++) {
            result.append(stringToRepeat);
            if (i < repeatCount - 1) {
                result.append(delimiter); // Añade el delimitador solo entre repeticiones
            }
        }

        out.println(result.toString());
    }

    private boolean isPositiveInteger(String str) {
        try {
            int num = Integer.parseInt(str);
            return num > 0;
        } catch (NumberFormatException e) {
            return false;
        }
	}

    public static void main(String[] args) {
        new RepeatServer().startLoop(args);
    }

}
