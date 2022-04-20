package ex;

public class ContadorPar {

	public static void main(String[] args) {
	
			numerosPares(32,1);

	}

    public static void numerosPares(int numero,int count) {	
    		if (numero<=2){
    			System.out.println(count);
    		}else {
    			if(isPar(numero)&&(numero!=0)){
        		count++;
        	    numerosPares(numero-1,count);
        	   
        	} else {
        		numerosPares(numero-1,count);
        		
        	}
    		}
        }
	
    public static boolean isPar(int n) {
    	if(n%2==0 || n==0) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
