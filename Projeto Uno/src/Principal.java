import java.util.Arrays;
import java.util.Scanner;


public class Principal {

	public static Jogador[] j = new Jogador[4];
	public static Baralho b = new Baralho();
	public static String cartaMesa = null;
	public static String campeao = null;
	
	
		public static void main(String[] args) {
		
		boolean ganhador = false;	
			
		
	
		nomearJogadores(j);
		distribuirCartas(b);
		
		while(!ganhador){
			
		
			for (int i = 0; i < j.length; i++) {
				
				realizarJogada(j[i]);
			}
		
			ganhador = testarGanhador();
		
		}
		
		System.out.println(String.format("%s, voce ganhou!!!",campeao));
		
	}

		private static boolean testarGanhador() {
			boolean resultado = false;
			
			for (int i = 0; i < j.length; i++) {
				
				if(j[i].qtdeCartas() == 0){
					
					resultado = true;
					campeao = j[i].getNome();
				}
				
			}
			
			if(b.cartas.size() == 0){
				
				int[] res = new int[4];
				for (int i = 0; i < res.length; i++) {
					
					res[i] = j[i].qtdeCartas();
				}
				
				Arrays.sort(res);
				
				for (int i = 0; i < res.length; i++) {
					
					for (int x = 0; x < j.length; x++) {
						
						if(j[x].qtdeCartas() == res[i]){
							
							campeao = j[x].getNome();
						}
					
					}
					
				}
				
				
			}
			
			return resultado;
		}

		private static void realizarJogada(Jogador jogador) {
			
			Scanner scan = new Scanner(System.in);
			String aux = null;
			int indice = 0;
			int selecao = 0;
			boolean resultado = false;
			
			
			while(!resultado){
				
				do{
				System.out.println(String.format(	"%s, a carta da mesa e: %s \n" +
												"As suas cartas sao: %s \n" +
												"Digite 1 para selecionar uma carta\n" +
												"Digite 2 para comprar uma carta",
												jogador.getNome(), cartaMesa, jogador.mostrarCartas()));
		
				aux = scan.nextLine();
				selecao = Integer.parseInt(aux);
				} while(selecao == 0 || selecao > 2);
				
			if(selecao == 1){
				do{
					System.out.println(String.format("%s, a carta da mesa e: %s \n",jogador.getNome(), cartaMesa));
						
						for (int i = 0; i < jogador.mostrarCartas().size(); i++) {
					
						System.out.println(String.format("Para selecionar a carta %s, digite: %s",
						jogador.selecionarCarta(i), (i+1)));
					}
						
				aux = scan.nextLine();
				indice = Integer.parseInt(aux);
				indice = indice-1;
				}while(indice > jogador.qtdeCartas()-1);
				
				System.out.println(String.format("Voce selecionou a carta: %s ",jogador.selecionarCarta(indice)));
				resultado = validarCarta(jogador.selecionarCarta(indice));
				
				if(resultado){
					
					cartaMesa = jogador.selecionarCarta(indice);
					jogador.removeCarta(indice);
				}
			
			} 
			
			
			if(selecao == 2){
				
				jogador.comprarCarta(b.cartas.remove(0));
				
			}
			
			
			
			
			}
			
		}
		
		
		private static boolean validarCarta(String cartajogador) {
			
			boolean resultado = false;
			
			if(cartaMesa.charAt(0) == cartajogador.charAt(0)  || 
					cartaMesa.charAt(1) == cartajogador.charAt(1)){
				
				System.out.println("teste ok");
				resultado = true;
				
			} else {
				
				System.out.println("Voce deve selecionar uma carta com o mesmo valor ou naipe");
			}
			
			return resultado;
		}

		private static void mostrarCartasJogador(Jogador jogador) {
			
			System.out.println(String.format("As cartas de %s sao: %s",jogador.getNome(), jogador.mostrarCartas()));
			
		}

		private static void distribuirCartas(Baralho b) {
			
			b.embaralhar();
			
			for (int i = 0; i < j.length; i++) {
				
				for (int x = 0; x < 5; x++) {
					
					j[i].comprarCarta(b.cartas.get(0).toString());
					b.cartas.remove(0);
				}
			}
			
			cartaMesa = b.cartas.get(0).toString();
			b.cartas.remove(0);
		}

		private static void nomearJogadores(Jogador[] j) {
			
			Scanner scan = new Scanner(System.in);
			String nome = null;
			
			for (int i = 0; i < j.length; i++) {
				
				j[i] = new Jogador();
				
				System.out.println(String.format("Digite o nome do jogador numero %d", i+1));
				nome = scan.nextLine();
				
				while(nome.equals("")){
					
					System.out.println(String.format("Digite o nome do jogador numero %d", i+1));
					nome = scan.nextLine();
				}
				
				j[i].setNome(nome);
			
			}
			
			for (int i = 0; i < j.length; i++) {
				
				System.out.println(String.format("%s e o jogador numero %d",j[i].getNome(), i+1));
			
			}
			
			
		}

}
