package repeti??o5;

import java.util.Random;
import java.util.Scanner;

public class For5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		    Random gerador = new Random(System.nanoTime());
		    int numero = 0, somaNum = 0;

		    do {
		      //numero = scanner.nextInt();
		      numero = gerador.nextInt(0, 120);
		      somaNum += numero;
		    }while (numero != 0);

		    System.out.println("Soma Total: " + somaNum);
		}
	}


