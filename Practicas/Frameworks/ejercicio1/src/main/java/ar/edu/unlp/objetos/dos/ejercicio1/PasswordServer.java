package ar.edu.unlp.objetos.dos.ejercicio1;

import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.ArrayList;

public class PasswordServer extends SingleThreadTCPServer{	

	@Override
	public void handleMessage(String message, PrintWriter out) {
        String[] args = message.split(" "); // Divide la línea por los espacios

		if (args.length == 3) {
			String allowedLetters = args[0];
			String allowedNumbers = args[1];
			String allowedSpecialChars = args[2];

			String password = generatePassword(allowedLetters, allowedNumbers, allowedSpecialChars);
			out.println(password);
		}else {
			out.println("Error: formato incorrecto. Envia tres argumentos separados por espacio.");
		}
	}
		
	private String generatePassword(String letters, String numbers, String specialChars) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        password.append(letters.charAt(random.nextInt(letters.length()))); 
		password.append(letters.charAt(random.nextInt(letters.length())));
        password.append(numbers.charAt(random.nextInt(numbers.length()))); 
        password.append(specialChars.charAt(random.nextInt(specialChars.length()))); 

        String allChars = letters + numbers;
        for (int i = 4; i < 8; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        return password.toString();
    }
	
	public static void main(String[] args) {

        new PasswordServer().startLoop(args);

    }
}
