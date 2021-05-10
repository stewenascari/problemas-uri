import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);String[] entrada = input.nextLine().split(" ");
		while (!entrada[0].equals("0") || !entrada[1].equals("0") || !entrada[2].equals("0")) {
			int l1 = Integer.parseInt(entrada[0]); int l2 = Integer.parseInt(entrada[1]); int l3 = Integer.parseInt(entrada[2]);ArrayList<Integer> provisoria = new ArrayList<Integer>();
			for (int i = 0; i < l1; i++) {
				provisoria.add(i + 1);
			}
			int ind1 = 0; int ind2 = l1 - 1;String VaiPrintarMzr = ""; int quant = 0; int companhia1; int companhia2;
			while (provisoria.size() != 0) {
				companhia1 = 0;companhia2 = 0; ind1 = ind1 + l2 - 1;
				while (ind1 >= l1) ind1 = ind1 - l1;ind2 = ind2 - l3 + 1;  
				while (ind2 < 0) ind2 = l1 + ind2;quant = provisoria.get(ind2);
				if (ind1 < ind2)companhia1++;
				if (ind2 < ind1)companhia2++;
				if (ind2 == ind1) {
					if (provisoria.get(ind1) > 9)
						VaiPrintarMzr += " ";
					else
						VaiPrintarMzr += "  ";
					VaiPrintarMzr += provisoria.get(ind1);
					ind2--;
					provisoria.remove(ind1);
					if (provisoria.size() > 0)
						VaiPrintarMzr += ",";
					l1--;
				} else {
					if (provisoria.get(ind1) > 9)
						VaiPrintarMzr += " ";
					else
						VaiPrintarMzr += "  ";
					VaiPrintarMzr += provisoria.get(ind1);
					if (provisoria.get(ind2) > 9)
						VaiPrintarMzr += " ";
					else
						VaiPrintarMzr += "  ";
					VaiPrintarMzr += provisoria.get(ind2);

					provisoria.remove(ind1);
					for (int i = 0; i < provisoria.size(); i++) {
						if (provisoria.get(i) == quant) {
							provisoria.remove(i);
							break;
						}
					}
					companhia1++;ind2 = ind2 - companhia1;ind1 = ind1 - companhia2;
					if (provisoria.size() > 0)VaiPrintarMzr += ",";
					l1 = l1 - 2;
				}
			}
			System.out.println(VaiPrintarMzr);entrada = input.nextLine().split(" ");
		}
	}

}