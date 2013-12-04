import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;


public class Dijkstra {
	
	private List<Nodo> nodosVisitados = new ArrayList<Nodo>();
	private Stack pilha = new Stack<>();
	private List<Nodo> menorCaminho = new ArrayList<Nodo>();
	private List<Nodo> nodoInseridos = new ArrayList<Nodo>();
	private int distancia;
	private Nodo atual = new Nodo();
	
	public void inserir(int origem, int destino, int distancia ){
		
		
		Nodo n1 = new Nodo();
		Nodo n2 = new Nodo();
		Aresta a = new Aresta();
		
		n1.setIndice(origem);
		n2.setIndice(destino);
		
		a.setDistancia(distancia);
		a.setOrigem(n1);
		a.setDestino(n2);
		
		for (int j = 0; j < nodoInseridos.size(); j++) {
				
			if (nodoInseridos.get(j).getIndice() == n1.getIndice()){
				
				nodoInseridos.get(j).setAresta(a);
			}
		}	
		
		n1.setAresta(a);
		n2.setAnterior(n1);
		nodoInseridos.add(n1);
		
		for (int j = 0; j < nodoInseridos.size(); j++) {
			
			if (nodoInseridos.get(j).getIndice() == n2.getIndice()){
				
				nodoInseridos.get(j).setAresta(a);
			}
		}	
		
		nodoInseridos.add(n2);
		
	}


	public List<Nodo> getNodosVisitados() {
		return nodosVisitados;
	}


	public void setNodosVisitados(Nodo nodosVisitados) {
		this.nodosVisitados.add(nodosVisitados);
	}


	public List<Nodo> buscaMenorCaminho(int origem, int destino) {
		
		Nodo aux = new Nodo();
		Nodo atual = new Nodo();
		
		aux = buscarNodo(origem);
		//aux2 = buscarNodo(indice2);
		
		montarCaminhos(aux);
		
		pilha.push(aux);
		
		
		
		return menorCaminho;
	}


	private void montarCaminhos(Nodo origem) {
		
		int custo = 0;
		Nodo aux = new Nodo();
		atual = origem;
		
		origem.setDistancia(0);
		nodosVisitados.add(origem);
		
	 for (int i = 0; i < origem.getAresta().size(); i++) {
		
		 custo = origem.getAresta().get(i).getDistancia();
		 
		 origem.getAresta().get(i).getDestino().setDistancia(0);
	}
		
		
		
		/*
		while (!pilha.isEmpty()){
			
			
			aux = (Nodo) pilha.peek();
			
			if(atual.getIndice() == aux.getIndice()){
				
				distancia = 0;
				aux.setDistancia(distancia); //custo da origem para chegar na origem;
			
			} else {
				
				for (int i = 0; i < atual.getAresta().size(); i++) {
					
					atual.getAresta().get(i).
				}
			}
			
			
			for (int i = 0; i < aux.getAresta().size(); i++) {
				
				pilha.push(aux.getAresta().get(i).getDestino());//empilha os nodos que está apontando
			}
			
			nodosVisitados.add(aux);
			atual = aux;
		}*/
		
	}


	private Nodo buscarNodo(int indice1) {
		
		Nodo resultado = new Nodo();
		
		for (int i = 0; i < nodoInseridos.size(); i++) {
			
			if (nodoInseridos.get(i).getIndice() == indice1){
				
				resultado = nodoInseridos.get(i);
			}
		}
		
		return resultado;
  }
	
	

}
