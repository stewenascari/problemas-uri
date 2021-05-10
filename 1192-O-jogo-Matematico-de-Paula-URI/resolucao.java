import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {
 
    public static void main(String[] args){
 
        Scanner n = new Scanner(System.in);
		int quantidade=n.nextInt();
		
		for(int i=0;i<quantidade;i++){
			String input=n.next();
			int n1=Integer.parseInt(input.substring(0,1));
			int n2=Integer.parseInt(input.substring(2,3));
			String letra=input.substring(1,2);
			int resultado;
			if(n1==n2){
				resultado=n1*n2;
			}else if(Character.isUpperCase(input.charAt(1))){
				resultado=n2-n1;
				
			}else{
				resultado=n1+n2;
			}
			System.out.println(resultado);
			

		}
 
    }
 
}