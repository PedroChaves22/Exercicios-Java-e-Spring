package pacote1;

import java.util.Scanner;

public class Classe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner(System.in);
        import javax.swing.JOptionPane;
        
       double soma,fonte;
		double dolEUA= 1;
		double eurEUR;
		double rubRUS = 58.76;
		double ienJAP = 138.13;
		double libING = 0.85;
		double renCHI = 6.75;
		double reaBRA = 5.42;
        double pesARG = 128.42;
		
        String inputValue = JOptionPane.showInputDialog(�Insira a quantidade em Euro: �);
        
		eurEUR= leia.nextDouble();
		
		
		fonte= eurEUR;
		//esse � o valor de euro em dolar
		
		soma=fonte*dolEUA;
		System.out.println("Seu euro em dolar: " + soma);
		
		soma=fonte*rubRUS;
		System.out.println("Essa � sua quantidade de Euro em Rublo Russo: "+soma);
	    
	    soma=fonte*ienJAP;
	    System.out.println("Essa � sua quantidade de Euro em Iene: "+soma);
	    
	    
	    soma=fonte*libING;
	    System.out.println("Essa � sua quantidade de Euro em Libras Esterlinas: "+soma);
	     
	    soma=fonte*renCHI;
	    System.out.println("Essa � sua quantidade de Euro em Renminbi: "+soma);
	    
	    
	    soma=fonte*reaBRA;
	    System.out.println("Essa � sua quantidade de Euro em Real: "+soma);
	   
	    
	    soma=fonte*pesARG;
	    System.out.println("Essa � sua quantidade de Euro em Peso Argentino: "+soma);
	    
	}

}
	
