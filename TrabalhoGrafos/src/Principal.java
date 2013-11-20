import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Principal {
	
	private static String PWD = System.getProperty("user.dir");
	private static String SEPARADOR = "=" ;
	
	public static void main(String[] args) {
   
		
	try {
		
		leArquivo();
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	}
	
	
	public static void leArquivo() throws IOException{	
		
		FileReader arq = new FileReader(PWD + File.separator + "arquivo.txt");        
		BufferedReader lerArq = new BufferedReader(arq);      
		String linha = lerArq.readLine();        
		Scanner aux = new Scanner(System.in);		
		
       
		while (linha!= null) {
		        	
			String parametros[] =  linha.split(SEPARADOR);         
	
				linha = lerArq.readLine();
 
		}
		
	}	
		
        
}
