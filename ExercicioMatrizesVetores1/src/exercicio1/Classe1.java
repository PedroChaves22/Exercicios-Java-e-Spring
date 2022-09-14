package exercicio1;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]notas = new int[5];
			int maiorNota = 0;
			
			
					
			
Scanner entrada = new Scanner(System.in);
				for(int x = 0 ; x < 5; x++){
					System.out.println("Digite 5 notas: ");
				notas[x] =  entrada.nextInt();
				
				   if(notas[x] >= maiorNota);{
						maiorNota = notas[x];
						
			}

			System.out.println(maiorNota);

			
			}
	}

}
