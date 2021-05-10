import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public  static void main(String []args){
		Scanner input = new Scanner(System.in);int quantDeTimesCompetindo= Integer.parseInt(input.nextLine());int instancia=0;String classificado="";
		List<String>ListaDosClassificados=new ArrayList<String>();
		while(quantDeTimesCompetindo!=0){
			instancia++;int [][]campeonato= new int [quantDeTimesCompetindo][4];
			for(int i=0;i<quantDeTimesCompetindo;i++){
				campeonato[i][0]=i+1;
			}
			if(quantDeTimesCompetindo<=100 && quantDeTimesCompetindo>=1){
				int result=quantDeTimesCompetindo*(quantDeTimesCompetindo-1)/2;
				for(int i=0;i<result;i++){
					String partida=input.nextLine();String[]ordenar=partida.split(" ");int quantVezes1=Integer.parseInt(ordenar[1]);
					                                                                   int quantVezes2=Integer.parseInt(ordenar[3]);
					
					for(int k=0;k<quantDeTimesCompetindo;k++){
						if(Integer.parseInt(ordenar[0])==campeonato[k][0]){
						campeonato[k][1]+=quantVezes1;campeonato[k][2]+=quantVezes2;
							if(quantVezes1>quantVezes2){
								campeonato[k][3]+=2;
							}
						}
					}
					for(int k=0;k<quantDeTimesCompetindo;k++){
						if(Integer.parseInt(ordenar[2])==campeonato[k][0]){
							campeonato[k][1]+=quantVezes2;campeonato[k][2]+=quantVezes1;
							if(quantVezes2>quantVezes1){
								campeonato[k][3]+=2;
							}
						}
						
					}
				
				}
			}
			campeonato=somatorioDosPontos(campeonato);
			classificado="";classificado +="Instancia "+ instancia +"\n";
			for(int i=0;i<quantDeTimesCompetindo;i++){
				classificado+=campeonato[i][0];
				if(i+1!=quantDeTimesCompetindo){
					classificado+= " ";
				}
			}
			ListaDosClassificados.add(classificado);ListaDosClassificados.add("");quantDeTimesCompetindo= Integer.parseInt(input.nextLine());
		}
		for(int i=0;i<ListaDosClassificados.size()-1;i++){
			System.out.println(ListaDosClassificados.get(i));
		}
	}
	public static double Testando(int[][] campeonato, int i){
	   	 double testes;
	   	 if(campeonato[i][2] != 0){
	   		testes = (double)campeonato[i][1] / campeonato[i][2];
	   	 }else testes = campeonato[i][1];
	   	 	return testes;
	   	 
	}
	public static int[][]somatorioDosPontos(int[][]campeonato){
		int minimo;int[]listaProvisoria;
		for(int i=0;i<campeonato.length;i++){
			minimo=i;
			for (int k=i+1;k<campeonato.length;k++){
				if(campeonato[k][3]>campeonato[minimo][3]){
					listaProvisoria=campeonato[minimo];campeonato[minimo]=campeonato[k];campeonato[k]=listaProvisoria;
				}
				else if(campeonato[k][3]==campeonato[minimo][3]){
					double teste1=Testando(campeonato,k);double teste2=Testando(campeonato,minimo);
					if(teste1>teste2){
						listaProvisoria=campeonato[minimo];campeonato[minimo]=campeonato[k];campeonato[k]=listaProvisoria;
					}
					else if(teste1==teste2){
						if(campeonato[k][1]>campeonato[minimo][1]){
							listaProvisoria=campeonato[minimo];campeonato[minimo]=campeonato[k];campeonato[k]=listaProvisoria;
						}
						else if(campeonato[k][1] == campeonato[minimo][1]) {
		       				   if (campeonato[k][0] < campeonato[minimo][0]){
		       					listaProvisoria = campeonato[minimo];campeonato[minimo] = campeonato[k];campeonato[k] = listaProvisoria;
			    			    
		       				   }
		       			   }
					}
				}
			}
		}
		return campeonato;
		
	}
	
}