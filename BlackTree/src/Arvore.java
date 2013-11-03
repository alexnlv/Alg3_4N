import java.util.TreeSet;

public class Arvore {

	private String chave;
	private String valor;
	private Nodo raiz;
	private Nodo tio;
	private int altura = 0;

	public void insere(String chave, String valor) {

		Nodo novoNodo = new Nodo(chave.hashCode(), valor);

		if (raiz.equals(null)) {

			novoNodo.black = true;
			raiz = novoNodo;
			raiz.altura = 0;
			raiz.pai = null;
			raiz.direita = null;
			raiz.esquerda = null;
			return;
		}

		Nodo nodoAux = raiz;

		while (novoNodo.pai.equals(null)) {

			if (novoNodo.indice > nodoAux.indice) {
				
				altura++;
				
					if (nodoAux.direita.equals(null)) {
						
						nodoAux.direita = novoNodo;
						novoNodo.pai = nodoAux;
						novoNodo.direita = null;
						novoNodo.esquerda = null;
						novoNodo.altura = altura;
					}
					
				nodoAux = nodoAux.direita;	
			} 
			
			

		}

			if (novoNodo.indice < nodoAux.indice) {

				nodoAux = nodoAux.esquerda;

				if (nodoAux.equals(null)) {

					novoNodo.pai = nodoAux;

				}
			}

		}

	public void remover(String chave) {

	}

}
