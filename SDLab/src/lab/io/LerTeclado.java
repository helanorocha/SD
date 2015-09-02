package lab.io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;





import lab.io.*;
public class LerTeclado {

	InputStream inputStream = System.in;
	InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public LerTeclado() throws IOException {

		// Ler cadeia de bytes de um teclado
		InputStream inputStream = System.in;

		// Converte para Char
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

		// Concatena o conjunto de Char em uma String
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	}

	public String lerLinha() throws IOException {

		// Lê uma linha
		String line = bufferedReader.readLine();
		return line;
	}
	
		public void close() throws IOException {

		// Close
		bufferedReader.close();
	}
}
