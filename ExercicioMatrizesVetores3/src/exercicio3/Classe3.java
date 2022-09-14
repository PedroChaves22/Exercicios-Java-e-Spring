package exercicio3;

import java.util.Random;
import java.util.Scanner;

public class Classe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maior = 0, soma = 0, media = 0; 
				 
				Scanner gerador = new Scanner;
				int [] valorDado = new int[10]; 
				
				int dSeis = 6;  
						int maiorOcorrencia = 0; 
						int numeroLancamentos = 10;
						Random gerador = new Random();
				for(int i = 0; i <= numeroLancamentos - 1; i++){
					valorDado[i] = gerador next.int());

				}

				for(int i = 0; i <= numeroLancamentos - 1; i++){	


					soma += valorDado[i];

					if(valorDado[i] == maior){
						maiorOcorrencia++;
					}
					
					if(valorDado[i] > maior){
						maior = valorDado[i];
						maiorOcorrencia = 1;
					}

					
				}

				media = soma/numeroLancamentos;

				System.out.println("O maior lance foi de: " + maior + " caiu x" + maiorOcorrencia + "\n");
				System.out.println("A média aritmética dos lances foram: " + media);
	}

}
