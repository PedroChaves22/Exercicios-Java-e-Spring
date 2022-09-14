package repetição4;

import java.util.Scanner;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade, sexo, mentalidade;
		int calmos = 0;
		int mulheresNervosas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int nervososMaisQuarenta = 0;
		int calmosMenosDezoito = 0;
		int i = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		while(i <= 150) {
			
			System.out.println("Digite a idade da pessoa: ");
			idade = input.nextInt();
			
			do {
				System.out.println("Digite uma opção válida para sexo: ");
				System.out.println("1 - Feminino");
				System.out.println("2 - Masculino");
				System.out.println("3 - Outros");
				sexo = entrada.nextInt();
			}while(sexo < 1 || sexo >3);
			
			do {
				System.out.println("Digite uma opção válida para comportamento: ");
				System.out.println("1 - Calme");
				System.out.println("2 - Nervose");
				System.out.println("3 - Agressive");
				mentalidade = entrada.nextInt();
			}while(mentalidade < 1 || mentalidade >3);
			
			if(mentalidade == 1) 
				calmos++;
			if(sexo == 1 && mentalidade == 2)
				mulheresNervosas++;
			if(sexo == 2 && mentalidade == 3)
				homensAgressivos++;
			if(sexo == 3 && mentalidade == 1)
				outrosCalmos++;
			if(idade > 40 && mentalidade == 2)
				nervososMaisQuarenta++;
			if(idade < 21 && mentalidade == 1)
				calmosMenosDezoito++;
			
			i++;
		}
		
		System.out.println("\nO numero de pessoas calmes: " + calmos);
		System.out.println("O numero de mulheres nervoses: " + mulheresNervosas);
		System.out.println("O numero de homens agressives: " + homensAgressivos);
		System.out.println("O numero de outres calmos: " + outrosCalmos);
		System.out.println("O numero de pessoas com mais de 40 anos e nervoses: " + nervososMaisQuarenta);
		System.out.println("O numero de pessoas com menos de 18 anos e calmes: " + calmosMenosDezoito);

		entrada.close();
	}
	
}
