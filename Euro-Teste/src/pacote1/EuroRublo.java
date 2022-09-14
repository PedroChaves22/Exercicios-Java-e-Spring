package pacote1;

import java.util.Scanner;

public class EuroRublo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		double soma,fonte;
		double dolEUA= 1;
		double eurEUR;
		double rubRUS = 58.76;
		double ienJAP = 138.13;
		double libING = 0.85;
		double renCHI = 6.75;
		double reaBRA = 5.42;
        double pesARG = 128.42;
		
		System.out.println("Insira a quantidade em Euro: ");
		eurEUR= leia.nextDouble();
		
		
		soma = 0;
		fonte=eurEUR;
		//esse é o valor de euro em dolar
		
		System.out.println("Seu euro em dolar: " + soma);
		soma=fonte*1;
		
		System.out.println("Essa é sua quantidade de Euro em Rublo Russo: "+soma);
	    soma=fonte*58.76;
	    
	    System.out.println("Essa é sua quantidade de Euro em Iene: "+soma);
	    soma=fonte*138.13;
	    
	    System.out.println("Essa é sua quantidade de Euro em Libras Esterlinas: "+soma);
	    soma=fonte*libING; 
	    
	    System.out.println("Essa é sua quantidade de Euro em Renminbi: "+soma);
	    soma=fonte*renCHI;
	    
	    System.out.println("Essa é sua quantidade de Euro em Real: "+soma);
	    soma=fonte*reaBRA;
	    
	    System.out.println("Essa é sua quantidade de Euro em Peso Argentino: "+soma);
	    soma=fonte*pesARG;
	}

}
