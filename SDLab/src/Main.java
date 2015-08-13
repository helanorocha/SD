import java.io.IOException;

import lab.io.EscreverArquivo;
import lab.io.LerTeclado;



public class Main {

	public static void main(String[] args) throws IOException {
		LerTeclado lerTeclado = new LerTeclado();
		
		String linha = lerTeclado.lerLinha();
		lerTeclado.close();
		
		new EscreverArquivo();
	}

}
