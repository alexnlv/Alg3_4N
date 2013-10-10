
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
	 * REMO��O EM UMA ARVORE RED-BLACK
	 * 
	 * Caso 1 - N � a raiz - N <- B
	 * Caso 2 - Todos 
	 * 			- Trocar cor de P e S 
	 * 			- Rotacionar em P em dir a N
	 * 			- Seguir p/ caso 3
	 * 
	 * Caso 3 - Todos s�o B
	 * 			- S <- R
	 * 			- Volto p/ caso 1 em P
	 * 
	 * Caso 4 - Todos s�o B exceto o P
	 * 			- Trocar a cor de P com S
	 * 
	 * Caso 5 - S e Sr s�o B e Sl � R
	 * 			- Trocar cor de S com Sl
	 * 			- Rotacionar em dire��o a Sr
	 * 			- Segue para caso 6
	 * Caso 6 - 
	 * 			- S recebe cor de P
	 * 			- P e Sr viram B
	 * 			- Rotacionar em p em dire��o a N
	 * 			
	 * 
	 * --------------------------------//----------------------
	 * 					3� TRABALHO
	 * 	Implementar um sistema de consulta de valores a partir de chaves
	 * , onde a estrutura que armazena os valores � uma Red Black Tree
	 * 	No inicio do sistema deve ser lido um arquivo que possui
	 * um registro por linha.
	 * 	Cada registro � composto por um par chave-valor, no seguinte formato:
	 * chave = valor
	 * 	Apos a cria��o da arvore, com o conteudo do arquivo, o sistema deve permitir:
	 *  - Consulta de um valor, dado uma chave (comando "search")
	 *  - Inclus�o de um par chave-valor (comando "insert")
	 *  - Exclus�o de um par chave-valor, dada uma chave (comando "remove")
	 *  - Chaves e valores s�o do tipo String.
	 *  
	 *   ENTREGA: 10/11/2013
	 *   
	 *    Obs.: Um registro por linha
	 *    come�ar implementando uma arvore binaria de busca e depois implementar a inser��o de parametros.
	 *    Procurar um metodo de saber se a arvore est� sendo implementada.
	 *    Se quiser pegar o algoritmo do wikipedia (em ingles).		  
	 * 
	 */

}
