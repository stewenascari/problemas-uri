import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); int quant=Integer.parseInt(input.nextLine());
		 
		for (int i=0;i<quant;i++){
			String variavel=input.nextLine(); String[]string=variavel.split(" "); sortear(string,string.length); String vaiPrintarMzr="";
			
			for(int k=0;k<string.length;k++){
				vaiPrintarMzr+=string[k] + " ";
			}
			System.out.println(vaiPrintarMzr.substring(0,vaiPrintarMzr.length()-1));
		}	
  	}
	public static void sortear(String [] string, int tamanho){
		String ajuda;
		for (int i=tamanho-1;i>=1;i--){
			for(int k=0;k<i;k++){
				if(string[k].length()<string[k+1].length()){
					ajuda=string[k]; string[k]=string[k+1]; string[k+1]=ajuda;
				}
			}
		}
		

	}
	
}
