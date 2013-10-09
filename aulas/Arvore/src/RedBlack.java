
public class RedBlack {
	
	/*Restri��es
	 * Red Black Tre
	 * 1 - Um nodo � sempre vermelho (R) ou preto (B)
	 * 2 - A raiz � sempre preta
	 * 3 - As folhas da arvore s�o sempre pretas (B) e nulas.
	 * 4 - Todo nodo vermelho deve ter filhos pretos
	 * 5 - Todo caminho de um nodo ate as folhas tem o 
	 * sempre numero de nodos pretos
	 * 
	 * Valida��o da arvore Red Black
	 * 
	 * 1 - Se N � a raiz : N <- B (pintar de preto)
	 * 
	 * 2 - P � B: (se inserir um elemento na 
	 * arvore onde tinhamos apenas N o P (pai � preto))
	 * 
	 * 3 - P e U s�o R:
	 * 		- Troca cor de P, U e G (onde G � o avo e u �
	 * 		o tio (fica do outro contrario do pai na arvore)
	 * 		- Volta para passo 1 em G
	 * 
	 * 4 - a) P � R, U � B: 
	 *  	N � o filho a direita de P
	 *  	P � o filho a esquerda de G
	 * 		- Nesse caso rotacionar esq em P
	 * 		- Seguir p/ caso 5
	 * 		
	 * 		b) P � R, U � B: 
	 * 		N � filho a esquerda de P
	 * 		P � filho a direita de G
	 * 		- Rotacionar direita em P
	 * 		- Seguir p/ caso 5
	 * 
	 * 5 - P � R e U � B
	 * 		a) P e N s�o filhos a esquerda
	 * 		- Troca cor de P e G 
	 * 		- Rotacionar a direita em G
	 * 
	 * 		b) P e N s�o filhos a direita
	 * 		- Troca cor de P e G 
	 * 		- Rotacionar a esquerda  em G
	 * 		  
	 */

}
