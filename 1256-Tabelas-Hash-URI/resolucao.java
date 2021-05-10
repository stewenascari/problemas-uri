import java.util.Scanner;
public class Main {
	public static void main( String [] args){
		Scanner begin= new Scanner(System.in);
		int n= Integer.parseInt(begin.nextLine());
		for (int m=0;m<n;m++){
			String [] divisor= begin.nextLine().split(" ");
			int tamanhoDoArray= Integer.parseInt(divisor[0]);
			int quantChaves= Integer.parseInt(divisor[1]);
			String [] array= new String[tamanhoDoArray];
			divisor=begin.nextLine().split(" ");
			for(int i=0;i<tamanhoDoArray;i++){
				array[i]= i + " -> ";
			}
			for( int i=0;i<quantChaves;i++){
				int chave= Integer.parseInt(divisor[i]);
				int indiceDaChave= chave % tamanhoDoArray;
				array[indiceDaChave]+= chave + " -> ";
			}
			for( int i=0;i<tamanhoDoArray;i++){
				System.out.println(array[i]+ "\\");
			}
			if(m < (n-1))
			System.out.println("");
		}
	}
}