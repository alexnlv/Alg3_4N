import java.util.Scanner;


public class Principal {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(sc.hasNext()){
			
			String cmd = sc.next().toLowerCase();
			
			switch (cmd) {
			
			case "fim": finalizaPrograma(); 
			case "circulo": criaCiculo();	
				break;

			default:
				break;
			}
			
			
		}

	}

	private static void criaCiculo() {
		// TODO Auto-generated method stub
		
	}

	private static void finalizaPrograma() {
		// TODO Auto-generated method stub
		
	}

}
