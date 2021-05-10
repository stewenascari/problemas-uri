import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); int Quanttest = Integer.parseInt(input.nextLine());String [] separa = new String [2];
		String entradaNome;String detalhes;ArrayList<String> Thelist = new ArrayList<String>();
		while(Quanttest != 0){
			String [][][] encomenda = new String [2][3][Quanttest];
			for (int i = 0; i < 2; i++) for(int v = 0; v < 3; v++)for(int w =0; w < Quanttest; w++){
						encomenda[i][v][w] = "";
			}
			for( int i = 0; i < Quanttest; i++){
				entradaNome = input.nextLine(); detalhes = input.nextLine();separa = detalhes.split(" ");
				if(separa[0].equalsIgnoreCase("Branco")){
					if(separa[1].equalsIgnoreCase("p")){
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[0][0][w].isEmpty()){
								encomenda[0][0][w] = entradaNome;
								break;
							}
						}
					}
					else if(separa[1].equalsIgnoreCase("m")){
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[0][1][w].isEmpty()){
								encomenda[0][1][w] = entradaNome;
								break;
							}
						}
					}
					else{
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[0][2][w].isEmpty()){
								encomenda[0][2][w] = entradaNome;
								break;
							}
						}
					}
				}
				else if (separa[0].equalsIgnoreCase("Vermelho")){
					if(separa[1].equalsIgnoreCase("p")) {
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[1][0][w].isEmpty()){
								encomenda[1][0][w] = entradaNome;
								break;
							}
						}
					}
					else if(separa[1].equalsIgnoreCase("m")) {
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[1][1][w].isEmpty()){
								encomenda[1][1][w] = entradaNome;
								break;
							}
						}
					}
					else {
						for(int w = 0; w < Quanttest; w++){
							if(encomenda[1][2][w].isEmpty()){
								encomenda[1][2][w] = entradaNome;
								break;
							}
						}
					}
				}
			}
			for (int i = 0; i < 2; i++){
				for (int v = 0; v < 3; v++){
					ArrayList <String> novaLista = new ArrayList<String>();
					novaLista = adiciona1(encomenda[i][v]);
					Collections.sort(novaLista);
					encomenda[i][v] = adiciona2(novaLista);
				}
			}
			for(int i=0;i<2;i++) for(int v=0;v<3;v++) for(int w=0;w< Quanttest;w++) if(!encomenda[i][v][w].isEmpty()){
				if(i==0){
					if(v==0) Thelist.add("branco P "+encomenda[i][v][w]);
					if(v==1) Thelist.add("branco M "+encomenda[i][v][w]);
					if(v==2) Thelist.add("branco G "+encomenda[i][v][w]);
				}
				else{
					if(v==0) Thelist.add("vermelho P "+encomenda[i][v][w]);
					if(v==1) Thelist.add("vermelho M "+encomenda[i][v][w]);
					if(v==2) Thelist.add("vermelho G "+encomenda[i][v][w]);
				}
			}
			Quanttest = Integer.parseInt(input.nextLine());
			if (Quanttest !=0)Thelist.add("");
		}
		for (int i = 0; i < Thelist.size();i++){
			System.out.println(Thelist.get(i));
		}
	}
	public static String[] adiciona2(ArrayList<String> guia){
		String [] condutor = new String[guia.size()];
		for (int i = 0; i < guia.size(); i ++){
			condutor[i] = guia.get(i);
		}
		return condutor;
	}
	public static ArrayList adiciona1(String[] condutor){
		ArrayList<String> guia = new ArrayList<String>();
		for (int i = 0; i < condutor.length; i ++){
			guia.add(condutor[i]);
		}
		return guia;
	}
	

}