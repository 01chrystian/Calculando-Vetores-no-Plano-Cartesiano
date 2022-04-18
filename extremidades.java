package coordenadaVetorial;

import java.util.Scanner;

public class extremidades {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int extrEsquerda = 0;
		int extrDireita = 0;
		int d = 1;
		int e = 1;
		int extrDeCima = 0;
		int extrDeBaixo = 0;
		int c = 0;
		int b = 0;
		int valor1 = 0;
		int valor2 = 0;
		int valor3 = 0;
		int valor4 = 0;
	   
		
				
		System.out.println("Calculando Vetores no Plano Cartesiano" + "\n");
		System.out.println("Digite uma extremidade da esquerda da reta X. EX: -5: ");
	        extrEsquerda = sc.nextInt();
	    
	        while (extrEsquerda > 0) {
	    	System.out.println("ATENCAO: Somente numeros negativos com a inclusao do sinal de menos (-). EX: -3: "+ "\n");
	    	System.out.println("_______________________________________________________");
	    	System.out.println("Digite novamente uma extremidade da esquerda da reta X: ");
		extrEsquerda = sc.nextInt();
	        }
	    
	    
	        System.out.println("Digite uma extremidade da direita da reta X. EX: 5: ");
		extrDireita =sc.nextInt();
		
		while (extrDireita < 0) {
	    	System.out.println("ATENCAO: Somente numeros positivos, com excecao do sinal de mais (+). EX: 3: " + "\n");
	    	System.out.println("______________________________________________________");
	    	System.out.println("Digite novamente uma extremidade da direita da reta X: ");
		extrDireita = sc.nextInt();
	        }
	    
		System.out.println( "Gráficamente:");
		
		for(e = 0  ; e >= extrEsquerda; e--) {
	        int valorRetaE = ((e - extrEsquerda) * (-1));
	    	System.out.print(" ("  + valorRetaE + ")" );
	        }
		for(d = 1 ; d <= extrDireita; d++) {
		int valorRetaD = d;
	    	System.out.print(" (" + valorRetaD + ")");
	        }
		
		System.out.println(" -----> (X)" + "\n");
		
		System.out.println("Digite uma extremidade de cima da reta y. EX: 4: ");
		extrDeCima = sc.nextInt();
		
		while (extrDeCima < 0) {
	        System.out.println("ATENCAO: Somente numeros positivos, com excecao do sinal de mais (+). EX: 3: "+ "\n");
		System.out.println("___________________________________________________");
	    	System.out.println("Digite novamente uma extremidade de cima da reta y: ");
	    	extrDeCima = sc.nextInt();
			
		}
		
		System.out.println("Digite uma extremidade de baixo da reta y. EX: -2:");
		extrDeBaixo = sc.nextInt();
		
		while (extrDeBaixo > 0) {
	    	System.out.println("ATENCAO: Somente numeros negativos com a inclusao do sinal de menos (-). EX: -3: "+ "\n");
	    	System.out.println("____________________________________________________");
	    	System.out.println("Digite novamente uma extremidade de baixo da reta y: ");
	    	extrDeBaixo = sc.nextInt();
	        }
	    
		System.out.println( "Gráficamente:");
		System.out.println("\n" + "(Y)");
	
		for(c = 0 ; c < extrDeCima; c++) {
		int valorRetaC = (c-extrDeCima) * (-1);
	        System.out.print( "\n"+ "("  + valorRetaC + ")" +"\n");
	        }
	    
	        for(b = 0; b >= extrDeBaixo; b-- ) {
	    	int valorRetaB = ((b+extrDeBaixo) - (extrDeBaixo));
	    	System.out.print("\n"+ "("  + valorRetaB + ")" +"\n");
	        }
	    
	    
	    	
	        System.out.println("\n" + "Para que possa achar o vetor das coordenadas, ache duas coordenadas: " + "\n");
	    
	        System.out.println("1ª coordenada chamaremos de (A)" + "\n");
	        System.out.println("Escolha um valor que está na reta X: ");
	        valor1 = sc.nextInt();
	        System.out.println("Escolha um valor que está na reta y: ");
	        valor3 = sc.nextInt();
	    
	   
	        System.out.println("A coordenada de (A) é: " + "(" + valor1 + ";" + valor3 + ")" + "\n");
	       
	        System.out.println("2ª coordenada chamaremos de (B)" + "\n");
	        System.out.println("Escolha um valor que está na reta X: ");
	        valor2 = sc.nextInt();
	        System.out.println("Escolha um valor que está na reta y: ");
	        valor4 = sc.nextInt();
	       
		System.out.println("A coordenada de (B) é: " + "(" + valor2 + ";" + valor4 + ")" + "\n");
	        System.out.println("O vetor entre A até a extremidade de B é: " + "(" +(valor1-valor2) + ";" + (valor3-valor4) + ")" );
	        System.out.println("(A)----------" + "(" + (valor1-valor2) + ";" + (valor3-valor4) + ")" + "---------->(B)");
		
	}

}
