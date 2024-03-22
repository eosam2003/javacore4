package exercicio4;

import java.util.Scanner;

public class Exercicio4 {


	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor que você tem em Dolares: ");
		float valorDolar = sc.nextFloat();
		float conversaoReal = valorDolar * 5;

		System.out.println("O valor que você tem, convertido em reais é: R$ " + conversaoReal);

		sc.close();
	}
	
}
