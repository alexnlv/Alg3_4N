
public class Principal {

	public static void main(String[] args) {
	
		/*Livro algoritmos: Projeto de Algoritmos - Nivio Ziviani
		 * 
		 * ---Grafos nao direcionados----
		 * 
		 * Lista de adjacencias
		 * -Lista de vertices que cada vertice liga
		 *  
		 * Matriz de adjacencias 
		 * -Representacao compacta
		 * -As linhas e colunas sao formadas pelos vertices
		 * 
		 * 
		 * Matriz de incidencia
		 * 
		 * -Quando queremos saber os vertices e arestas
		 * -As linhas da matriz são os vertices e as colunas são as arestas
		 * -Preencher com um quando existe a ligacao
		 * 
		 * 
		 * ---Grafos direcionados
		 * 
		 * Lista de adjacencias
		 * -Lista de vertices que cada vertice liga, nesse caso apenas 
		 * a direcao que a aresta aponta.
		 * 
		 * Matriz de adjacencias 
		 * 
		 * -Linhas e colunas conforme os grafos nao direcionados, mas
		 * com valor negativo -1 quando chega no vertice
		 * 
		 * Matriz de incidencia
		 * 
		 * ----algoritmo para busca em largura----
		 * 
		 * fila p = new fila();
		 * p.push(lista.head)
		 * 
		 * list.head.pinta(cinza)
		 * 
		 * while(!p.vazia)
		 * 		vertice v = p.pop
		 * 		v.pinta(preto)
		 * 		for(vertice x:v.filhos)
		 * 			if (x.cor == branco)
		 * 				x.pinta(cinza)
		 * 				p.push(x)
		 * isso apenas percorre todos os nodos
		 * -*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
		 * 
		 * ----Algoritmo para busca em profundidade------
		 *  
		 * visitaFilho(lista.head)
		 * 
		 *public void visitaFilho(vertice v){
		 *	if(v.cor != branco) return
		 * 	v.pinta(cinza)
		 *****--faz algo antes dos filhos
		 * for(vertice x: v.filhos)
		 * 		visitaFilho(x)
		 * 		v.pinta(preto)
		 *****--faz algo depois dos filhos
		 * 
		 * 
		 * ------Arvore geradora minima (prism)----------
		 * --Criar:
		 * 	Lista de adjacencias
		 * 	Lista de nodos visitados
		 * 	Lista de nodos visitaveis 
		 * 	Lista arestas ou arvore 
		 * --Escolher um nodo qualquer
		 * --Enquanto existir nodo não vistado
		 * 		--Escolher nodo da lista de visitaveis com
		 * 		aresta de menor valor a partir dos visitados
		 *    
		 * 	
		 * ---Arvore Dijkstra's algorithm
		 * 		en.wikipedia.org
		 * 			pseudocode
		 * --Criar:
		 * 	Lista de vertices anteriores
		 * 	Lista de vertices P
		 * 	Lista de nodos visitados
		 * 
		 * Inicio:
		 * 	Iniciar as estruturas
		 * 		anteriores com   
		 * trabalho vai ser ler um arquivo que cada linha tem
		 * 3 valores: vertice, vertice e peso (custo)
		 * serão mais de 10 linhas
		 * 
		 * o programa tera que mostrar o caminho com o menor custo.
		 *  
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

	}

}
