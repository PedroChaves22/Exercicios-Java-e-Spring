package repetição4;

import java.util.Scanner;

public class Variavel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
		    float num = 0.f;

		    System.out.print("Insira numero: ");
		    num = scanner.nextFloat();

		    if(num % 2 == 0){
		      System.out.println("Par: " + Math.sqrt(num));
		    }else{
		      System.out.println("Impar: " + Math.pow(num, 2));
		    }
	}

}
