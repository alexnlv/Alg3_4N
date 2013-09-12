import java.util.Scanner;


public class Principal {

	
	public static void main(String[] args) {
		
		String cmd = "";
		Scanner scan = new Scanner(System.in);
		
		while(!cmd.equals("fim")){
			
			cmd = scan.nextLine();
			
			if(cmd.startsWith("imagem")){
				
				criarImagem(cmd);
				
			}
		
			if(cmd.startsWith("salvar")){
				
				criarArquivo(cmd);
			}
			
			if(cmd.startsWith("cor")){
				
				criarCor(cmd);
			}
			
			if(cmd.startsWith("circulo")){
				
				criarCirculo(cmd);
				
			}
			
			if(cmd.startsWith("reta")){
				
				criarReta(cmd);
				
			}
			
			if(cmd.startsWith("retangulo")){
				
				criarRetangulo(cmd);
				
			}
			
			if(cmd.startsWith("triangulo")){
				
				criarTriangulo(cmd);
				
				
			}
			
			
			
		}
		

	}

	private static void criarImagem(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 4){
			
			System.out.println("funcionou");
			
		} else{
			
			System.out.println("nao funcionou");
			
		}
		
	}

	private static void criarArquivo(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 2){
			
			
		} else{
			
			
		}
		
	}

	private static void criarCor(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 4){
			
			
		}
		
		if(parametros.length == 2){
			
		} else{
			
			
		}
		
	}

	private static void criarCirculo(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 4){
			
			Circulo c = new Circulo();
			System.out.println("funcionou");
			
			
		} else{
			
			
		}
		
	}

	private static void criarReta(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 5){
			
			Reta r = new Reta();
			System.out.println("funcionou");
			
		} else{
			
			
		}
		
	}

	private static void criarRetangulo(String cmd) {
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 5){
			
			Retangulo r = new Retangulo();
			System.out.println("funcionou");
			
		} else{
			
			
		}
		
	}

	private static void criarTriangulo(String cmd) {
		
		
		String[] parametros = cmd.split(" ");
		
		if(parametros.length == 4){
			
			Ponto[] p = new Ponto[3];
			
			for (int i = 0; i < p.length; i++) {
				
				for (int j = 1; j < parametros.length; j++) {
					
					p[i].x = Integer.parseInt(parametros[j]);
					j++;
					p[i].y = Integer.parseInt(parametros[j]);								
				}
			
			}
			
			Triangulo t = new Triangulo();
			
			
			System.out.println("funcionou");
			
			
		} else{
			
			
		}
	}

}
