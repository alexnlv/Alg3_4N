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
		
		System.out.println("A carta da mesa é: "+ cartaMesa);
		
		
		realizarJogada(j[0]);
		
	}

		private static void realizarJogada(Jogador jogador) {
			
			Scanner scan = new Scanner(System.in);
			String aux = null;
			int indice = 0;
			
			System.out.println(jogador.getNome() + " a carta da mesa é: "+cartaMesa+ "\n" 
			+"As suas cartas são: "+jogador.mostrarCartas()+ "\n"
			+"Selecione a carta a ser descartada \n");
			aux = scan.nextLine();
			indice = Integer.parseInt(aux);
			// transformar para inteiro
			jogador.selecionarCarta(indice);
			
			if(jogador.selecionarCarta(indice).equals(cartaMesa)){
				
			
			}
			
			
		}

		private static void mostrarCartasJogador(Jogador jogador) {
			
			System.out.println("As cartas de "+jogador.getNome()+" são: "+jogador.mostrarCartas());
			
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
				
				System.out.println("Digite o nome do " +(i+1)+"º jogador");
				nome = scan.nextLine();
				
				j[i].setNome(nome);
			
			}
			
			for (int i = 0; i < j.length; i++) {
				
				System.out.println(j[i].getNome()+ " é o "+ (i+1) + "º jogador");
			
			}
			
			
		}

}
