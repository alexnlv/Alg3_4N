
public class RedBlack {
	
	/*Restrições
	 * Red Black Tre
	 * 1 - Um nodo é sempre vermelho (R) ou preto (B)
	 * 2 - A raiz é sempre preta
	 * 3 - As folhas da arvore são sempre pretas (B) e nulas.
	 * 4 - Todo nodo vermelho deve ter filhos pretos
	 * 5 - Todo caminho de um nodo ate as folhas tem o 
	 * sempre numero de nodos pretos
	 * 
	 * Validação da arvore Red Black
	 * 
	 * 1 - Se N é a raiz : N <- B (pintar de preto)
	 * 
	 * 2 - P é B: (se inserir um elemento na 
	 * arvore onde tinhamos apenas N o P (pai é preto))
	 * 
	 * 3 - P e U são R:
	 * 		- Troca cor de P, U e G (onde G é o avo e u é
	 * 		o tio (fica do outro contrario do pai na arvore)
	 * 		- Volta para passo 1 em G
	 * 
	 * 4 - a) P é R, U é B: 
	 *  	N é o filho a direita de P
	 *  	P é o filho a esquerda de G
	 * 		- Nesse caso rotacionar esq em P
	 * 		- Seguir p/ caso 5
	 * 		
	 * 		b) P é R, U é B: 
	 * 		N é filho a esquerda de P
	 * 		P é filho a direita de G
	 * 		- Rotacionar direita em P
	 * 		- Seguir p/ caso 5
	 * 
	 * 5 - P é R e U é B
	 * 		a) P e N são filhos a esquerda
	 * 		- Troca cor de P e G 
	 * 		- Rotacionar a direita em G
	 * 
	 * 		b) P e N são filhos a direita
	 * 		- Troca cor de P e G 
	 * 		- Rotacionar a esquerda  em G
	 * 		  
	 */

}
