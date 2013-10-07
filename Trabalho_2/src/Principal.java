import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {
	
	public static Cor cor = new Cor(0);
	public static Imagem imagem = new Imagem(0, 0, cor);
	public static Reta reta = new Reta();
	public static Triangulo triangulo = new Triangulo();
	
	//public static Cor cor = new Cor(0);
	public static Circulo circulo = new Circulo();
	
	public static Retangulo retangulo = new Retangulo();
	public static String teste = null;
	
	
	
	
	public static void main(String[] args) {
		
		String cmd = "";
		Scanner scan = new Scanner(System.in);
		
		while(!cmd.toLowerCase().equals("fim")){
			
			String[] parametros = scan.nextLine().split(" ");
			cmd = parametros[0].trim();
			
			if ((parametros.length < 2)){
				
				if(cmd.toLowerCase().equals("fim"));
				else{
					System.out.println("Paramentros incorretos");
					}
				
			} else {
				
				if(testarParametros(parametros)){
											
						executaParametros(parametros);
					
						
					} else if(cmd.toLowerCase().equals("fim")){
						System.out.println("Paramentros incorretos");
					}else{
						System.out.println("Paramentros incorretos");
					}
			
			}	
		}
	}

	private static boolean testarParametros(String[] parametros) {
		
		boolean resultado = false;
		
		if(parametros[0].toLowerCase().trim().equals("imagem")){
			
			if(parametros.length == 4){
				
				if(ehInteiro(parametros[1]) && ehInteiro(parametros[2])){
					if(parametros[3].toLowerCase().trim().equals("g") || parametros[3].toLowerCase().trim().equals("rgb")){
						resultado = true;
					}
				}		
			}	
		}
			
		if(parametros[0].toLowerCase().trim().equals("salvar")){
			
			if(parametros.length == 2) resultado = true;
			
			
		}
		if(parametros[0].toLowerCase().trim().equals("cor")){
			
			if(parametros.length == 4){
				
				for (int i = 1, cont = 1; i < parametros.length; i++) {
					
					if(ehInteiro(parametros[i])){
						
						if((Integer.parseInt(parametros[i]) >= 0 && Integer.parseInt(parametros[i]) <= 255)){
					
						cont++;
						}
					}		
					if(cont == 4) resultado = true;		

				}				
			}
			
			if(parametros.length == 2){
				if((Integer.parseInt(parametros[1]) >= 0 && Integer.parseInt(parametros[1]) <= 255)) resultado = true;
			}	
		}	
		if((parametros[0].toLowerCase().trim().equals("reta")) || 
				(parametros[0].toLowerCase().trim().equals("retangulo"))){
			
			for (int i = 1, cont = 0; i < parametros.length; i++) {
				
				if(ehInteiro(parametros[i])){
					
					if((Integer.parseInt(parametros[i]) >= 0 && Integer.parseInt(parametros[i]) <= 255)){
				
					cont++;
					}
				}		
				if(cont == 4) resultado = true;		
			}	
		}
		
		if(parametros[0].toLowerCase().trim().equals("triangulo")){
			
		}
			
			
			for (int i = 1, cont = 0; i < parametros.length; i++) {
				
				if(ehInteiro(parametros[i])){
					
					if(	(Integer.parseInt(parametros[i]) >= 0 && Integer.parseInt(parametros[i]) <= 255)){
						
						cont++;
					}
					if(cont == 6) resultado = true;	
				}
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("circulo")){
			
			for (int i = 1, cont = 0; i < parametros.length; i++) {
				
				if(ehInteiro(parametros[i])){
					
					if(	(Integer.parseInt(parametros[i]) >= 0 && Integer.parseInt(parametros[i]) <= 255)){					
					
						cont++;
					}
				}	
				
				if(cont == 3) resultado = true;	
			}
			
			
		}
		
		return resultado;
	}

	private static boolean ehInteiro(String valor) {
		char[] c = valor.toCharArray();  
	    boolean flag = true;  
	  
	    for ( int i = 0; i < c.length; i++ )  
	          
	        if ( !Character.isDigit( c[ i ] ) ) {  
	            flag = false;  
	            break;  
	        }  
	    
	    return flag; 
	}

	private static void executaParametros(String[] parametros) {

		
		if(parametros[0].toLowerCase().trim().equals("imagem")){
			
			criarImagem(parametros);
			
		}
	
		if(parametros[0].toLowerCase().trim().equals("salvar")){
			
			criarArquivo(parametros);
		}
		
		if(parametros[0].toLowerCase().trim().equals("cor")){
			
			criarCor(parametros);
		}
		
		if(parametros[0].toLowerCase().trim().equals("circulo")){
			
			criarCirculo(parametros);
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("reta")){
			
			Reta rt = new Reta();
			rt.draw(cor, imagem);
			
			try {
				criarReta(parametros);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("retangulo")){
			
			criarRetangulo(parametros);
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("triangulo")){
			
			criarTriangulo(parametros);
			
			
		}
		
		
	}

	private static void criarImagem(String[] parametros) {
		
			imagem = new Imagem(Integer.parseInt(parametros[1]), Integer.parseInt(parametros[2]),cor);
			
			System.out.println("Imagem criada");
			
		
	}

	private static void criarArquivo(String[] parametros) {

		try {
			imagem.Salvar(parametros[1]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		System.out.println("Arquivo salvo");
	}

	private static void criarCor(String[] parametros) {

		
		
		if(parametros.length > 2){
			Cor cor = new Cor(Integer.parseInt(parametros[1]),
								Integer.parseInt(parametros[2]),
								Integer.parseInt(parametros[3]));
		} else {
			
			Cor cor = new Cor(Integer.parseInt(parametros[1]));
			
		}
		
		System.out.println("Parametro armazenado");
		
	}

	private static void criarCirculo(String[] parametros) {
		
		Ponto p = new Ponto();
		
		p.x = Integer.parseInt(parametros[1]);
		p.y = Integer.parseInt(parametros[2]);
		/*circulo.setRaio(Integer.parseInt(parametros[3]));
		circulo.setCentro(p);
		circulo.draw(cor);
		*/
		System.out.println("Parametro armazenado");
	
		
	}

	private static void criarReta(String[] parametros) throws Exception {
		
		Ponto[] p = new Ponto[2];
		p[0] = new Ponto();
		p[1] = new Ponto();
		int cont = 1; 
						
		for (int i = 0; i < p.length; i++) {
				
			p[i].x = Integer.parseInt(parametros[cont]);
			cont = cont + 1;
			p[i].y = Integer.parseInt(parametros[cont]);
			cont = cont + 1;
		}
		
		
		reta.setVertices(p[0], p[1]); 
		reta.drawReta(imagem, cor);
		
		System.out.println("Parametro armazenado");

	}

	private static void criarRetangulo(String[] parametros) {
		
		
		Ponto[] p = new Ponto[2];
		int cont = 1;
		
		for (int i = 0; i < p.length; i++) {
			
			p[i].x = Integer.parseInt(parametros[cont]);
			cont++;
			p[i].y = Integer.parseInt(parametros[cont]);								
			cont++;
		
		}
		
		/*retangulo.setVertices(p[0], p[1]);
		retangulo.draw(cor);
		*/
		System.out.println("Parametro armazenado");
	}

	private static void criarTriangulo(String[] parametros) {
		
			
			Ponto[] p = new Ponto[3];
			int cont = 1;
			
			for (int i = 0; i < p.length; i++) {
			
				p[i].x = Integer.parseInt(parametros[cont]);
				cont++;
				p[i].y = Integer.parseInt(parametros[cont]);								
				cont++;
			
			}
			
			/*triangulo.setVertices(p[0], p[1], p[2]);
			triangulo.draw(cor);
			*/
			System.out.println("Parametro armazenado");

	}

}
