import java.util.Scanner;


public class Principal {

	public static Jogador[] j = new Jogador[4];
	public static Baralho b = new Baralho();
	public static String cartaMesa = null;
	
	
		public static void main(String[] args) {
		
			
		
	
		nomearJogadores(j);
		distribuirCartas(b);
		
		
		
		for (int i = 0; i < 4; i++) {
			
			mostrarCartasJogador(j[i]);
		
		}
		
		clearConsole();
		
		//System.out.println("A carta da mesa e: "+ cartaMesa);
		
		
		realizarJogada(j[0]);
		
	}

		private static void realizarJogada(Jogador jogador) {
			
			Scanner scan = new Scanner(System.in);
			String aux = null;
			int indice = 0;
			
			System.out.println(String.format(	"%s, a carta da mesa e: %s \n" +
												"As suas cartas sao: %s \n" +
												"Selecione a carta a ser descartada",
												jogador.getNome(), cartaMesa, jogador.mostrarCartas()));
		
			aux = scan.nextLine();
			indice = Integer.parseInt(aux);
			
			   jogador.selecionarCarta(indice);
			
			if(jogador.selecionarCarta(indice).equals(cartaMesa)){
				
			
			}
			
			
		}
		
		
		private static void clearConsole() { 
			try { String os = System.getProperty("os.name");
			
					if (os.contains("Win")) { 
						
						Runtime.getRuntime().exec("cls"); 
					
					} else { 
						
						Runtime.getRuntime().exec("clear"); 
				
				}
					} catch (Exception exception) { // Handle exception. } } 
			}
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
				
				j[i].setNome(nome);
			
			}
			
			for (int i = 0; i < j.length; i++) {
				
				System.out.println(String.format("%s e o jogador numero %d",j[i].getNome(), i+1));
			
			}
			
			
		}

}
