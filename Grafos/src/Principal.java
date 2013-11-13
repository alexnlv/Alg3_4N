
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
		 * -As linhas da matriz s�o os vertices e as colunas s�o as arestas
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
		 * 
		 * 
		 */

	}

}
