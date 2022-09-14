package repetição3;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		
		int i ,idade ,total21 = 0,total50=0;
		
		System.out.println("\nInforme sua idade: ");
		idade=ler.nextInt();
				
		while(idade!=99)
		{
			if(idade<21)
			{
				total21++;
			}
			else if (idade>50)
			{
				total50++;
			}
			else
			{
				System.out.println("Idade não computada!");
			}
			System.out.println("\nInforme sua idade: ");
			idade=ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de "+total21);
		System.out.println("\nO total de pessoas com mais de 50 anos é de "+total50);
	}

}
