import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);int quant;
		int QuantParaRodar= Integer.parseInt(input.nextLine());
		for(int i=0;i<QuantParaRodar;i++){
			
			String n=input.nextLine(); String [] listando= n.split("");quant=0;
			for (int e=0;e<listando.length;e++){
				if(listando[e].equalsIgnoreCase("<")){
					for(int d=e+1;d<listando.length;d++){
						if(listando[d].equals(">")){
							listando[e]=".";listando[d]="."; quant++;
							break;
						}
					}
				}
			}
			System.out.println(quant);
		}

	}
}
