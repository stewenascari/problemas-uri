import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main (String [] args){
		
		Scanner input= new Scanner (System.in);
		boolean encontrado= false;
		int n=-1, ValorParaPesquisar=-1, indice=0,  caso=1, valorPesquisado=0;
		//onde n é o número de peças,q é a quantidade de questão q vai ter,
		//indice que é para o exemplo de saida para numerar o caso,a númeração do caso em sim e o valor pesquisado
		do{
		n=input.nextInt(); ValorParaPesquisar= input.nextInt();
		
		if( n==0 && ValorParaPesquisar==0){
			break;
		}
		
		int vetor[]= new int[n];
		
		for(int i=0; i<vetor.length;i++){
			vetor[i]=input.nextInt();
		}
		
		int vetor2[]= new int[ValorParaPesquisar];
		
		for(int i=0; i<vetor2.length;i++){
			vetor2[i]=input.nextInt();
		}
		
		Arrays.sort(vetor);
		System.out.println("CASE# " + caso+":");
			
		for(int j=0;j<vetor2.length;j++){
			valorPesquisado= vetor2[j];
			for(int i=0;i<vetor.length;i++){
				if(vetor[i]== valorPesquisado){
					encontrado=true;
					indice=i+1;
					break;
				}else{
					encontrado=false;
				}
			}
			if(encontrado){
				System.out.println(valorPesquisado+ " found at " +indice);
			}else{
				System.out.println(valorPesquisado+ " not found");
			}
		}
		caso++;
	  }while(n!=0 && ValorParaPesquisar!=0);
	}
}
