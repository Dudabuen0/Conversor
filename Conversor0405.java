import java.util.Scanner;
public class Conversor0405 {
	
	public static void main(String[] args) {
		//Declaração de variedádes
		double f, c, op,  total;
		
		//Criação e instância do objeto de entrada
	    Scanner entrada = new Scanner (System.in);
       
        do{
       
    //Apresentação
	     System.out.println("\n\t\t\t  *** Bem vindo ao conversor *** \n");
         
         System.out.println("1. Celsius - Fahrenheit");
         System.out.println("2. Fahrenheit - Celius ");
         System.out.println("3. Sair");

         System.out.print("Opção: ");
         op = entrada.nextInt();

         if(op == 1){
       
    //Entradas
	     System.out.print("Informe C: ");
	     c = entrada.nextDouble();
	    
	//Processamento
	     f= (c * 1.8) + 32;
	    
	//Saida
	     System.out.println("\n" + c + " = " + f + "\n\n");

        }else if (op == 2){
        
    //Entradas
	     System.out.print("Informe F: ");
	     f = entrada.nextDouble();
	    
	//Processamento
         c = (f-32)/9 *5;
	    
	//Saida
	     System.out.println("\n" + f + " = " + c + "\n\n");
      
         }else if(op == 3) {
         
         System.out.println("\n\t\t\t -- Forte abraço! -- \n");
    }
        }while(op!=3);
      }
    }