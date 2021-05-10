import java.util.Scanner;
import java.util.ArrayList;



public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int quantidade=input.nextInt();
		ArrayList <Integer> eliminado;
		ArrayList <Integer> sobrevivente=new ArrayList<Integer>();;
		int pulo=0;
		
		
		if(quantidade>=1 && quantidade<=30){
			
			for(int i=0;i<quantidade;i++){
				pulo=0;
				int quantPessoa=input.nextInt();
				int tamPulo=input.nextInt();
				eliminado=new ArrayList <Integer>();
				
				for (int f=0;f<quantPessoa;f++){
					eliminado.add(f+1);
				}
				if(quantPessoa>= 1 && quantPessoa <= 10000 && tamPulo >= 1 && tamPulo <= 1000){
					while(eliminado.size() > 1){
						for(int n=0;n<eliminado.size();n++){
							pulo++;
							if(pulo==tamPulo){
								
								eliminado.remove(n);
								n--;
								pulo=0;
							}
						}
						
					}
				}
				sobrevivente.add(eliminado.get(0));
			}
		}
		
		for(int cont=0;cont<sobrevivente.size();cont++){
			System.out.println("Case " + (cont+1) + ": "+ sobrevivente.get(cont));
		}
	}

}
