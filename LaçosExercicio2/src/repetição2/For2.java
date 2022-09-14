package repetição2;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
        int num, Pares = 0, Impares = 0;
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite o " + i + "º número: ");
            num = entrada.nextInt();
            
            if(num % 2 == 0){
                Pares++;
            }

                       if(num % 2 == 1){
                Impares++;
            }
                    }
        
        System.out.println("Foram digitados " + Pares + " números pares. \n");
         System.out.println("E " + Impares + " números ímpares.");
       
	}

}
