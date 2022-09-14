package repetição2;

import java.util.Scanner;

public class Variavel2 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	        int num1, num2, num3, maiorNumero;

	        System.out.println("Digite um número: ");
	        num1 = entrada.nextInt();

	        System.out.println("Digite um número: ");
	        num2 = entrada.nextInt();

	        System.out.println("Digite um número: ");
	        num3 = entrada.nextInt();
	        
	        if(num1<num2) {
	        	System.out.println(num1);
	        	if(num2<num3) {
	        		System.out.println(num2);
	        		if(num3<num2) {
	    	        	System.out.println(num3);
	        		}
	        		else if(num2<num1) {
	        			System.out.println(num2);
	        		}
	        			        		}
	        	}
	        }

	}


