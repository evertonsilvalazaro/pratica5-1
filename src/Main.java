import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i, contador=0;
		
		for(i=0;i<10;i++) {
			System.out.println("informe um numero ");
			i=sc.nextInt();
			if(i<0) 
			contador++;
			{
				System.out.println("Os numeros negativos são "+contador);
			}
			
		}
		
	
		
		
		sc.close();
	}

}
