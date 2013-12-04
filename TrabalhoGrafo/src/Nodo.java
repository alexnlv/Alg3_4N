import java.util.ArrayList;
import java.util.List;


public class Nodo {
	
	private int indice;
	private Nodo anterior;
	private boolean visitado = false;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private int distancia;
	
	
	public int getIndice() {
		return indice;
	}
	
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	public Nodo getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}

	public List<Aresta> getAresta() {
		return arestas;
	}

	 public void setAresta(Aresta novaAresta){
         
         this.arestas.add(novaAresta);
         
 }

	public boolean isVisitado() {
		return visitado;
	}

	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	public int distanciaOrigemDestino(Nodo destino) {
		
		int resultado = 0;
			
		for (int i = 0; i < arestas.size(); i++) {
			
			if (arestas.get(i).getDestino().equals(destino)){
				
				resultado = arestas.get(i).getDistancia();
				
			}
			
		}
		
		return resultado;
	}

}
