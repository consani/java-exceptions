import java.util.Scanner;

public class ExemploExcecao {
	
	public static void main(String[] args) {
		
		System.out.println("Extraindo a raiz quadrada...");
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero:");
		double numero = scan.nextDouble();
		
		double resultado = 0;
		try {
			resultado = raiz(numero);
			System.out.printf("A raiz de %.2f � %.2f \n",numero,resultado);
		} catch (RaizInvalidaException e1) {
			System.out.println(e1.getMessage());
		}
		
		
	private static double raiz(double numero) throws RaizInvalidaException {
		if(numero < 0){
			RaizInvalidaException rie = 
					new RaizInvalidaException("Raiz Inv�lida : "+numero);
			throw rie;
		}
		double result = Math.sqrt(numero);
		return result;
	}
	
	private static int dividir(int num1, int num2){
		int result = num1/num2;
		return result;
	}
	
	

}
