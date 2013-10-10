
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
	 * REMOÇÃO EM UMA ARVORE RED-BLACK
	 * 
	 * Caso 1 - N é a raiz - N <- B
	 * Caso 2 - Todos 
	 * 			- Trocar cor de P e S 
	 * 			- Rotacionar em P em dir a N
	 * 			- Seguir p/ caso 3
	 * 
	 * Caso 3 - Todos são B
	 * 			- S <- R
	 * 			- Volto p/ caso 1 em P
	 * 
	 * Caso 4 - Todos são B exceto o P
	 * 			- Trocar a cor de P com S
	 * 
	 * Caso 5 - S e Sr são B e Sl é R
	 * 			- Trocar cor de S com Sl
	 * 			- Rotacionar em direção a Sr
	 * 			- Segue para caso 6
	 * Caso 6 - 
	 * 			- S recebe cor de P
	 * 			- P e Sr viram B
	 * 			- Rotacionar em p em direção a N
	 * 			
	 * 
	 * --------------------------------//----------------------
	 * 					3º TRABALHO
	 * 	Implementar um sistema de consulta de valores a partir de chaves
	 * , onde a estrutura que armazena os valores é uma Red Black Tree
	 * 	No inicio do sistema deve ser lido um arquivo que possui
	 * um registro por linha.
	 * 	Cada registro é composto por um par chave-valor, no seguinte formato:
	 * chave = valor
	 * 	Apos a criação da arvore, com o conteudo do arquivo, o sistema deve permitir:
	 *  - Consulta de um valor, dado uma chave (comando "search")
	 *  - Inclusão de um par chave-valor (comando "insert")
	 *  - Exclusão de um par chave-valor, dada uma chave (comando "remove")
	 *  - Chaves e valores são do tipo String.
	 *  
	 *   ENTREGA: 10/11/2013
	 *   
	 *    Obs.: Um registro por linha
	 *    começar implementando uma arvore binaria de busca e depois implementar a inserção de parametros.
	 *    Procurar um metodo de saber se a arvore está sendo implementada.
	 *    Se quiser pegar o algoritmo do wikipedia (em ingles).		  
	 * 
	 */

}
