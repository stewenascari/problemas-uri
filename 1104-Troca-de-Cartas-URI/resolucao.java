import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		
		int aline,beatriz;
		String condicao="";
		Scanner input = new Scanner(System.in);
		int qtdCartas1,qtdCartas2;
		
		
		while(!condicao.equals("0 0")){
			
			String entrada=input.nextLine();
			String []dividir=entrada.split(" ");
			qtdCartas1=Integer.parseInt(dividir[0]);
			qtdCartas2=Integer.parseInt(dividir[1]);
			int contador=0;
			
			if(!(qtdCartas1 < 1 || qtdCartas1 > 10000 || qtdCartas2 < 1 
				|| qtdCartas2 > 10000)){
				
				int[]CartasAline= new int[qtdCartas1+1];
				entrada=input.nextLine();
				dividir=entrada.split(" ");
				
				for(int i=0;i<qtdCartas1;i++){
					CartasAline[i]=Integer.parseInt(dividir[i]);
				}
				CartasAline[qtdCartas1]=-1;
				
				if(CartasAline[0]<1 ||CartasAline[qtdCartas1-1]>100000){
					break;
				}
				
				int []CartasBeatriz=new int[qtdCartas2+1];
				entrada=input.nextLine();
				dividir=entrada.split(" ");
				
				for(int i=0;i<qtdCartas2;i++){
					CartasBeatriz[i]=Integer.parseInt(dividir[i]);
				}
				CartasBeatriz[qtdCartas2]=-1;
				
				if(CartasBeatriz[0]<1 ||CartasAline[qtdCartas1-1]>100000){
					break;
				}
				
				boolean ajuda;
				aline=0;   beatriz=0;
				
				for(int i=0;i<qtdCartas1;i++){
					if(aline==(qtdCartas1)||beatriz==(qtdCartas2)){
						break;
					}
					ajuda=false;
					
					if(CartasAline[i]!=CartasAline[i+1]){
						
						for (int w = 0; w<qtdCartas2;w++ ){
                            if (CartasAline[i]<CartasBeatriz[w]){
								break;
							}
                            if(CartasAline[i]==CartasBeatriz[w]){
                            	ajuda=true; aline++;
                            	break;
                            }
						}
						if(!ajuda){
							
							for(int b=beatriz;b<qtdCartas2;b++){
								ajuda=false;
								
								if(CartasBeatriz[b]!=CartasBeatriz[b+1]){
									
									for (int a = 0; a<qtdCartas1;a++ ){
										
			                            if (CartasBeatriz[b]<CartasAline[a]){
											break;
										}
			                            if(CartasBeatriz[b]==CartasAline[a]){
			                            	ajuda=true; beatriz++; 
			                            	break;
			                            }
									}
									if(!ajuda){
										aline++; beatriz++; contador++;
										break;
									}
								}
								else if(CartasBeatriz[b]==CartasBeatriz[b+1]){
									beatriz++;
								}
								
							}
						}
						
					}
					else if (CartasAline[i] == CartasAline[i+1]){
						aline++;
					}
				}
			}
			condicao=entrada;

			if(!condicao.equalsIgnoreCase("0 0")){
                System.out.println(contador);
            }
			
		}
	}
}

			
		

	


