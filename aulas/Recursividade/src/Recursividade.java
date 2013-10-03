
import static java.lang.System.*;

public class Recursividade {

	public static void main(String[] args) {
		
		//int s = 500;
		
		long t = currentTimeMillis(); //retornar o tempo atual em milisegundos.
		
		//out.println(recFatorial(5));
		
		//out.println(currentTimeMillis() - t);
		
		
		//t = currentTimeMillis();
		//out.println(iterFatorial(5));
		
		
		out.println(recFibonacci(37));
		out.println(currentTimeMillis() - t + " recursivo");
		
		t = currentTimeMillis();
		out.println(iterFibonacci(37));
		out.println(currentTimeMillis() - t + " iterativo");
	}
	
	private static double iterFibonacci(int n) {
		double result = 0;
		double oldResult = 1;
		
		for (int i = 0; i <= n; i++) {
			
			double temp = result;
			result += oldResult;
			oldResult = temp;
			
		}
		
		return result;
	}

	private static double recFibonacci(int n) {
		
		if(n < 1) return 0;
		if(n == 1) return 1;
		
		return recFibonacci(n - 1) +
			recFibonacci(n - 2); 
				
	}

	private static double iterFatorial(int n) {
	
		double res = 1;
		
		for (int j = 2; j < n; j++) {
			
			res *= j;
		}
		
		return res;
	}

	private static double recFatorial(int n){
		
		if(n < 1) return 0;
		
		if(n == 0) return 1; 
		
		return recFatorial(n -1) * n;
	}

}
