
public class Nodo {

	private static Nodo dir = null;
	private static Nodo esq = null;
	private static final Nodo pai = null;

	public static void main(String[] args) {
		
		int chave; //pode ser qualquer tipo
		
		/*regra balanceamento AVL
		Abs(H(e) - H(d)) < 2
		Abs = valor absoluto
		
		------Algoritmo para arvore AVL------
		Fator de balanceamento AVL
		FB(n) = H(e) - H(d)
		
		Se FB(n) == -2 
			se FB(FD) == +1
			RotDir(FD)
		RotEsq(n);
				
		Se FB(n) == +2 
			se FB(FE) == -11
			RotEsq(FE)
		RotDir(n)
		
		----fim---
		
		H(n) = Max( H(e), H(d)) + 1
		
		Onde H é a altura
		*/
	}
	
	public void RotDir(Nodo P){ //rot. arvore binaria a direita
		
		Nodo FE = P.esq;
		Nodo N = FE.dir;
		FE.dir = P;
		P.esq = N;
		Nodo G = P.pai;
		
		//G -> FE G= nodo avô 
		
		
		
	}
	
	public void RotEsq(Nodo P){ ////rot. arvore binaria a esquerda
		
		Nodo FD = P.dir;
		Nodo N = FD.esq;
		FD.esq = P;
		P.dir = N;
		Nodo G = P.pai;
		
		//G -> FE G= nodo avô 
		
		
		
	}

} 
