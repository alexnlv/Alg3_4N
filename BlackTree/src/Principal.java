import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Principal {
	
	private static String PWD = System.getProperty("user.dir");
	private static String SEPARADOR = "=" ;

	public static void main(String[] args) throws IOException {
		
        //leitura do arquivo
        FileReader arq = new FileReader(PWD + File.separator + "arquivo.txt");
        BufferedReader lerArq = new BufferedReader(arq);
        Arvore arv = new Arvore();
        String linha = lerArq.readLine();
               
        while (linha!= null) {
        	
            String parametros[] =  linha.split(SEPARADOR);
            arv.insere(parametros[0], parametros[1]);
            
            linha = lerArq.readLine();            
        }

	}

}