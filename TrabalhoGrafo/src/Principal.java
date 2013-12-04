import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
	
	private static String PWD = System.getProperty("user.dir");
	private static String SEPARADOR = " " ;
	private static Dijkstra d = new Dijkstra();
	private static List<Nodo> menorCaminho = new ArrayList<Nodo>();


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String aux = " ";

		try {
			
			leArquivo();
			
		} catch (Exception e) {
			
		}
		
		
		while (!aux.equalsIgnoreCase("fim")){
			
			System.out.println("Digite o vertice inicial e final");
			
			aux = sc.nextLine();
			
			String parametros[] =  aux.split(SEPARADOR);
			
			if (parametros[0].equalsIgnoreCase("fim")){
				
				break;
			
			} else {
				
				
				menorCaminho = d.buscaMenorCaminho(Integer.parseInt(parametros[0]), Integer.parseInt(parametros[1]));
				
				
			}
			 
			
			
			
		}
		
		
		
	}
	
	public static void leArquivo() throws IOException{	
		
		FileReader arq = new FileReader(PWD + File.separator + "arquivo.txt"); 
		BufferedReader lerArq = new BufferedReader(arq);      
		String linha = lerArq.readLine();        
		Scanner aux = new Scanner(System.in);		
		int n1, n2, distancia;
       
		while (linha!= null) {
			
			String parametros[] =  linha.split(SEPARADOR);
			n1 = Integer.parseInt(parametros[0]);
			n2 = Integer.parseInt(parametros[1]);
			distancia = Integer.parseInt(parametros[2]);
		    
			d.inserir(n1, n2, distancia);    	
			linha = lerArq.readLine();   
			}
	}

}
