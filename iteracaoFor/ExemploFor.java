package iteracaoFor;

import java.util.Scanner;

public class ExemploFor {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        for ( int i =0; i<10; i++) {
            System.out.println("O N° da Interação é " +i);
        }
    }

    public void exemplo2() {
        int vetor[] = new int[10];
        for (int i=0 ;i<vetor.length ; i++) { //.length significa o tamanho do meu vetor
            System.out.println("Digite o valor do Vetor["+i+"]:");
            vetor[i]=sc.nextInt();
        }
        
    }
    
    public void exercicio1() {

        int vetor[] = new int[5];
        for (int i = 0; i< vetor.length; i++) {
          System.out.println("Digite o valor do Vetor["+i+"]:");
          vetor[i]=sc.nextInt();            
        }
    }

    public void exercicio2() {
        
        int Vetor[] = new int[10];
        for (int i=0; i>Vetor.length; i--) {
            System.out.println("Digite o valor do Vetor["+i+"]:");
        }
    }
}
