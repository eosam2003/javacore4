package exercicio5;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] Args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o Valor que você tem em Reais: ");
		float valorReal = sc.nextFloat();
		float conversaoDolar = valorReal / 5;

		System.out.println("O valor que você tem, convertido em Dolar é: $ " + conversaoDolar);

		sc.close();

	}
	
}
