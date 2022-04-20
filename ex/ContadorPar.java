package ex;

public class ContadorPar {

	public static void main(String[] args) {
	
			System.out.println(numerosPares(32,1));

	}

    public static int numerosPares(int numero,int count) {	
    		if (numero<=0){
    			count++;
    		}else {
    			if(isPar(numero)&&(numero!=0)){
        		count++;
        	    numerosPares(numero-1,count);
        	} else {
        		numerosPares(numero-1,count);
        	}
    		}
   
            return count;
        }

    
   
    
    public static boolean isPar(int n) {
    	if(n%2==0 || n==0) {
    		return true;
    	} else {
    		return false;
    	}
    }

}
