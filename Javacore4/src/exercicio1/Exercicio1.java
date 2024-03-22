package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	   public static void main(String[] args) {
	    
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o número A: ");
	        int A = scanner.nextInt();
	        System.out.print("Digite o número B: ");
	        int B = scanner.nextInt();
	        System.out.print("Digite o número C: ");
	        int C = scanner.nextInt();
	        System.out.print("Digite o número D: ");
	        int D = scanner.nextInt();
	        int somaAB = A + B;
	        int multAB = A * B;
	        int somaAC = A + C;
	        int multAC = A * C;
	        int somaAD = A + D;
	        int multAD = A * D;
	        
	        int somaBC = B + C;
	        int multBC = B * C;
	        int somaBD = B + D;
	        int multBD = B * D;
	        
	        int somaCD = C + D;
	        int multCD = C * D;
	        
	        System.out.println("Soma A+B: " + somaAB);
	        System.out.println("Multiplicação A*B: " + multAB);
	        System.out.println("Soma A+C: " + somaAC);
	        System.out.println("Multiplicação A*C: " + multAC);
	        System.out.println("Soma A+D: " + somaAD);
	        System.out.println("Multiplicação A*D: " + multAD);
	        System.out.println("Soma B+C: " + somaBC);
	        System.out.println("Multiplicação B*C: " + multBC);
	        System.out.println("Soma B+D: " + somaBD);
	        System.out.println("Multiplicação B*D: " + multBD);
	        System.out.println("Soma C+D: " + somaCD);
	        System.out.println("Multiplicação C*D: " + multCD);
	        scanner.close();
  }	    
}
	
