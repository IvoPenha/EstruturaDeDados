package ex;
import javax. swing. JOptionPane;
public class Fibonnaci {
		public static void main(String[] args) {
			int num=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero n para sequencia de fibonacci")) ;
			System.out.println(fibonacci(num));
		}

public static int fibonacci(int numero) {
	if (numero<=1) {
		return numero;
	} else {
		if (numero==2) {
			return 1;
		} else {
			return fibonacci(numero-1)+ fibonacci(numero-2);
		}
	}
	
	
}
}









/*funcaofibonacci(inteiro n){
    se(n == 1)
      retorne 0
    senao{
      se(n == 2)
        retorne 1
      senao
        retorne fibonacci(n - 1) + fibonacci(n - 2)
    }
  }
  
  funcao inicio(){
    inteiro n

    escreva("Qual termo deseja descobrir? ")
    leia(n)

    escreva("O termo ", n, " é: ", fibonacci(n))
  }*/
