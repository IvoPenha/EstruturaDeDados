package ex;


public class binario {

	public static void main(String[] args) {
		int num = 541;
		toBinario(num);

	}

public static void toBinario(int numero) {
    if (numero==0) {
        System.out.print(numero);
    } else {
        toBinario(numero/2);
        System.out.print(numero%2);
    }
}}
