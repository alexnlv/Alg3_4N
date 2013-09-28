import java.util.Scanner;


public class Principal {

	
	public static void main(String[] args) {
		
		String cmd = "";
		Scanner scan = new Scanner(System.in);
		
		while(!cmd.equals("fim")){
			
			String[] parametros = scan.nextLine().split(" ");
			cmd = parametros[0].trim();
			
			if ((parametros.length < 2)){
				
				if(cmd.equals("fim"));
				else{
					System.out.println("Paramentros incorretos");
					}
				
			} else {
				
				if(testarParametros(parametros)){
											
						executaParametros(parametros);
					
						
					} else if(!cmd.equals("fim")){
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
				
				if(parametros[1].toLowerCase().trim().equals("r") &&
					parametros[2].toLowerCase().trim().equals("g") &&
						parametros[3].toLowerCase().trim().equals("b"))	resultado = true;
				}				
			
			if(parametros.length == 2){
				if(parametros[1].toLowerCase().trim().equals("g")) resultado = true;
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

		System.out.println(parametros[0]);
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
			
			criarReta(parametros);
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("retangulo")){
			
			criarRetangulo(parametros);
			
		}
		
		if(parametros[0].toLowerCase().trim().equals("triangulo")){
			
			criarTriangulo(parametros);
			
			
		}
		
		
	}

	private static void criarImagem(String[] parametros) {
		
				
			System.out.println("funcionou");
	
		
	}

	private static void criarArquivo(String[] parametros) {
		
		System.out.println("funcionou");
	}

	private static void criarCor(String[] parametros) {
		
		System.out.println("funcionou");
		
	}

	private static void criarCirculo(String[] parametros) {
		
				
			Circulo c = new Circulo();
			System.out.println("funcionou");
	
		
	}

	private static void criarReta(String[] parametros) {
	
			Reta r = new Reta();
			System.out.println("funcionou");

	}

	private static void criarRetangulo(String[] parametros) {
		
			Retangulo r = new Retangulo();
			System.out.println("funcionou");
	}

	private static void criarTriangulo(String[] parametros) {
		
			
			Ponto[] p = new Ponto[3];
			
			/*for (int i = 0; i < p.length; i++) {
				
				for (int j = 1; j < parametros.length; j++) {
					
					p[i].x = Integer.parseInt(parametros[j]);
					j++;
					p[i].y = Integer.parseInt(parametros[j]);								
				}
			
			}
			
			Triangulo t = new Triangulo();
			
			t.setVertices(p[0], p[1], p[2]);
			*/
			System.out.println("funcionou");

	}

}
