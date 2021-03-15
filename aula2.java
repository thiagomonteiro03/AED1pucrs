import java.util.Random;

import javax.swing.plaf.TreeUI;

public class aula2 {

	public static void main(String args[]){

		int [] vet = geraVetor(5, 5);
		int [] res = new int[vet.length];
		int [] res1 = new int[vet.length];
		int cont = 0;
		int cont1 = 0;
		int cont2 = vet.length -1;
		int contRev = vet.length - 1;
		Boolean stats = true;

		for(int i = 0; i<vet.length;i++){
			if(vet[i]%2==0){
				res1[cont1] = vet[i];
				cont1++;
			}else{
				stats = true;
				for(int j = 0; stats;contRev--){
					if(vet[contRev]%2>0){
						res1[cont2] = vet[contRev];
						stats = false;
						cont2--;
					}
				}
			} 
		}

		for(int i = 0; i<vet.length;i++){
			if(vet[i]%2==0){
				res[cont] = vet[i];
				cont++;
			} 
		}

		for(int i = 0; i<vet.length;i++){
			if(vet[i]%2>0){
				res[cont] = vet[i];
				cont++;
			} 
		}

		System.out.println("Números originais: ");
		for(int i = 0; i<vet.length;i++){
			System.out.print(vet[i]+", ");
		}
		System.out.println("");
		System.out.println("Leitura única: ");
		for(int i = 0; i<res1.length;i++){
			System.out.print(res1[i]+", ");
		}
		System.out.println("");
		System.out.println("Leitura repetitiva: ");
		for(int i = 0; i<res.length;i++){
			System.out.print(res[i]+", ");
		}

	}



    private static int[] geraVetor(int nroPares, int nroImpares){
		int [] res = null;
		int contPar = 0, contImpar = 0, novoNum;
		Random rnd = new Random();
		
		if ((nroPares >= 0) || 
			(nroImpares >= 0) && 
			(nroPares + nroImpares > 0)) {
			
			res = new int[nroPares + nroImpares];
			
			while ((contPar < nroPares) || (contImpar < nroImpares)) {
				novoNum = rnd.nextInt(98)+1;
				
				if ((novoNum % 2 == 0) && (contPar < nroPares)) {
					res[contPar+contImpar] = novoNum;
					contPar++;
				}
				else if ((novoNum % 2 == 1) && (contImpar < nroImpares)) {
					res[contPar+contImpar] = novoNum;
					contImpar++;
				}
			}
		}
		
		return res;
	}
    
}
